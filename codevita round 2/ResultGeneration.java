import java.util.*;

class ResultGeneration {

    public static int counterOfA(String[] temparr){
        int counter = 0;
        for( int i = 2; i < temparr.length ; i++){
            if(temparr[i].equalsIgnoreCase("A"))
                counter++;
        }
        return counter;
    }
    public static int returnPT(String pid,String Problems[]){
        for(int i = 0; i< Problems.length; i++){
            String p[] = Problems[i].split(" ");
            if(pid.equals(p[0]))
                return Integer.parseInt(p[2]);                
        }
        return -999;
    }
    public static int returnPF(String pid,String Problems[]){
        for(int i = 0; i< Problems.length; i++){
            String p[] = Problems[i].split(" ");
            if(pid.equals(p[0]))
                return Integer.parseInt(p[1]);                
        }
        return -999;
    }
    public static setUsers(String Users[], int uid, int FS){
        String str = ""+uid+" "+FS;
        for(int i = 0; i< Users.length ; i++){
            if(Users[i].length() <= 1) continue;
            else{
                
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int P,i,U,Su,tempCount,FullScore[];
        String Problems[], Submissions[],tempstr,temparr[],Users[];
        float PartialScore[];

        //HashMap<Integer, Integer> FS= new HashMap<Integer, Integer>();
    
        // number of problems (P) in the Finale
        P = sc.nextInt();
        Problems = new String[P];

        // 3 space delimited integers denoting problem ID, problemscore (S) and number of test cases for that problem (T)
        sc.nextLine();
        for(i = 0 ; i< P ; i++){
            Problems[i] = sc.nextLine();
        }

        // 2 space delimited integers denoting number of finalists (U) and total submissions by all finalists (Su) in the Finale.
        U = sc.nextInt();
        Su = sc.nextInt();
        Submissions = new String[Su];
        Users = new String[U];
        FullScore = new int[U];
        PartialScore = new float[U];
        sc.nextLine();
        
        // space delimited integers denoting userid, problem ID, submission ID and status code for each test case in the problem delimited by space.
        for(i = 0 ; i < Su ; i++){
            tempstr = sc.nextLine();
            temparr = tempstr.split(" ");
            tempCount = counterOfA(temparr);

            tempstr = temparr[0] + " " + temparr[1] + " " + tempCount;
            Submissions[i] = tempstr;
        }
        // System.out.println("unSorted---");
        // for(i = 0 ; i < Su ; i++){
        //     System.out.println(Submissions[i]);
        // }
        Arrays.sort(Submissions,new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                String s1new[],s2new[];
                s1new = s1.split(" ");
                s2new = s2.split(" ");
                int uid1, uid2, nA1, nA2;
                uid1 = Integer.parseInt(s1new[0]) ;
                uid2 = Integer.parseInt(s2new[0]) ;
                if( uid1 > uid2) return 1;
                if(uid1 < uid2) return -1;
                if(s1new[1].compareTo(s2new[1]) != 0) return s1new[1].compareTo(s2new[1]);        
                else {
                    nA1 = Integer.parseInt(s1new[2]);
                    nA2 = Integer.parseInt(s2new[2]);
                    return nA2 - nA1;
                }
            }
        });
        System.out.println("Sorting---");
        for(i = 0 ; i < Su ; i++){
            System.out.println(Submissions[i]);
        }
        int FS =0;
        for(i = 0 ; i < Su ; i++){
            String tspC[] = Submissions[i].split(" ");
            int pT,pF,uid,nA;
            
            uid = Integer.parseInt(tspC[0]);
            ///////////////////////////////////////////////////////
            String pid = tspC[1];
            if(i == 0 ){
                
                pT = returnPT(pid,Problems);
                pF = returnPF(pid,Problems);
                nA = Integer.parseInt(tspC[2]);
                if( nA % pT == 0){
                    FullScore[uid] += pF;                    
                    FS += pF;
                }
                else
                    PartialScore[uid] += ( (float)nA/pT )*pF;
            }
            else{
                String tspP[] = Submissions[i-1].split(" ");
                int uidP = Integer.parseInt(tspP[0]);
                //////////////////////////////

                if(uid == uidP){
                    if(pid.equals(tspP[1])) continue;
                    else{
                        pT = returnPT(pid,Problems);
                        pF = returnPF(pid,Problems);
                        nA = Integer.parseInt(tspC[2]);
                        
                        if( nA % pT == 0){
                            FullScore[uid] += pF;
                            FS += pF;
                        }
                        else
                            PartialScore[uid] += ( (float)nA/pT )*pF;
                        setUsers(Users,uid,FS);
                    }
                }
                else {
                    FS = 0;
                    pT = returnPT(pid,Problems);
                    pF = returnPF(pid,Problems);
                    nA = Integer.parseInt(tspC[2]);
                    if( nA % pT == 0){
                        FullScore[uid] += pF;
                        FS += pF;
                    }
                    else
                        PartialScore[uid] += ( (float)nA/pT )*pF;
                }
            }
        }
        System.out.println("FullScore----");
        for(i = 0; i < FullScore.length; i++){
            System.out.println(PartialScore[i]);
        }

    }
}