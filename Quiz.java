import java.util.Scanner; //java.util package called 
public class Quiz
{                    //class begins
    public static void main(String[]args)
    {                //method begins
      try (Scanner sc = new Scanner(System.in)) {
        int cwrite=0;
          System.out.println("\t\t\t\tQUIZ CONTEST");
          System.out.println("Enter your name");
          String n=sc.nextLine(); /*User's name is 
                                   inputted*/
          System.out.print("Welcome "+n);
          System.out.println(" \tPress 'S' to start or Press 'E' to end the Quiz program");
          char ch=sc.next().charAt(0); /*takiing the entry
                                     of the user*/
   /*if(ch=='E')    //if 'E'is pressed,
              System.exit(0);  //program will end
          if(ch!='E' && ch!='S') /*when neither 'E' nor 'S' 
                              is pressed
               {
                 System.out.println("Press either S or E "); /*Giving 
                         user another chance, to play the Quiz show if
                                            'S' or'E' is not pressed
                 ch=sc.next().charAt(0); */                        
                
            if(ch=='S')  //when 'S' is entered
            {     //if starts
              System.out.println();
              System.out.println("GENERAL INSTRUCTIONS:-"); 
              //Declaring some useful instructions
               System.out.println("1) You will be questioned upon SPORTS ");
               System.out.println("2) You will be asked 15 questions upon it.");
               System.out.println("3) You must enter 'a','b' or 'c' for answering the questions,otherwise you will be marked Wrong.");
               System.out.println();/*General Instructions and
                                  the main set of 15 questions
                                are seperated by 1 line space*/
              char inputtedans[]=new char[15]; //inputtedans[] array created
              String quest[]={"Which was the first Asian city to host the Olympics?",/*15 questions stored in
                                                                                    array quest*/
                   "Which Indian athlete is nicknamed the 'Payyoli Express'?",
                   "Which Pakistani bowler made his debut with Sachin Tendulkar?",
                   "Which country won the women's hockey World Cup three times in a row between 1983 and 1990?", 
                   "In which discipline was the action hero,Bruce Lee,an expert?",
                   "The name of which Japenese martial art literally means 'Empty Hand'?",
                   "Bermuda Bowls is the world champoinship in which card game?",
                   "Which athlete once held the men's world record for both the 200 metres and 400 metres race?",
                   "'Beating The Field' is the autobiography of which cricketer?",
                   "Who was the first to win the FIFA World Cup both as a player and as a coach?",
                   "Which team won the 1984 Olympic men's hockey gold?",
                   "Which ex-Indian cricketer is the author of the book 'Sandy Storm'?",
                   "Who was the oldest Indian cricketer to make his debut?",
                   "In which country was the first game of Polo played?",
                   "Dr.Jigoro Kano is credited with the revival of which Japanese martial Art?"};
             String a[]={"Tokyo","P.T.Usha","Shoaib Akhtar",             
                         //Options (a) of 15 questions stored in a[]
                         "Germany","Kung Fu","Gozu-Kai","Solitaire",
                         "Usain Bolt","Brian Lara","Boby Charlton",
                         "India","Sandeep Patel","Yusuf Pathan",
                         "Iran","Taekwondo"};
             String b[]={"Jakarta","P.V.Sindhu","Waqar Younis",
                         //Options (b) of 15 questions stored in b[]    
                          "England","Karate","Taekwondo","Hearts",
                          "Michael Johnson","Rickey Ponting",
                          "Mario Zagalo","Canada","Navjot Singh Sidhu",
                          "R.J.D.Jamshedji","Germany","Karate"};
             String c[]={"Bejing","Hima Das","Imran Khan",
                       //Options (c) of 15 questions stored in c[]
                        "The Netherlands","Taekwondo","Karate",
                        "Bridge","Milkha Singh","Kapil Dev",
                        "Didier Deschamps","Pakistan","Irfan Pathan",
                        "Amit Kaur","Canada","Judo"};
             char ans[]={'a','a','b','c','a','c','c','b','a','b','c',
                     'a','b','a','c'}; /*Answers key of 15
                            questions stored in ans[]*/                                         
             for(int i=0;i<15;i++)
              {    //for loop starts
               System.out.println("Q"+(i+1)+")"+quest[i]); /*Question 
                                          is shown on screen*/
               System.out.println("a) "+a[i]+"\nb) "+b[i]+"\nc) "+c[i]); /*options (a),(b)&(c)are 
                                                         given with the help of a[],b[]&c[]*/
               System.out.println("Give your answer(a,b or c)");
               inputtedans[i]=sc.next().charAt(0); //user's answer inputted
               if(inputtedans[i]==ans[i]) /*checks whether
                         user's answer=actual answer or not*/
                    {     //if starts
                     System.out.println("CORRECT");
                     cwrite++; //increases its value if answer is correct
                    }    //end of if
                else
                {        //else starts
                     System.out.println("WRONG");
                     System.out.print("The correct answer is ("+ans[i]+")");  
                     /*shows the correct answer, if wrong
                       accrding to the conditions*/
                     if(ans[i]=='a')
                      System.out.println(a[i]);
                     if(ans[i]=='b')
                     System.out.println(b[i]);
                     if(ans[i]=='c')
                     System.out.println(c[i]);
                    }   //end of else
               System.out.println(); /*1 line gap after each
                                                 question*/
             }  //end of for loop
             System.out.println(n+" you have scored "+cwrite+" out of 15 questions");/*Display 
                                                                       of result*/
             float percent=0.0f;
             percent=(float)(cwrite*100)/15;//percentage calculation
             System.out.println("You have got "+percent+"%");
             if(percent<=40)
                       System.out.println("Don't be upset at all.Look for the answers and try again.");
             else if(40<=percent && percent<50)
                      System.out.println("A very good try.Waiting for more good results next time.");
             else if(50<=percent && percent<60)
                      System.out.println("You are almost going correct in your guisses.Just concentrate ");
             else if(60<=percent && percent<70)
                      System.out.println("Try a little hard.You can surely achieve success.");
             else if(70<=percent && percent<80)
                      System.out.println("You are going well,just concentrate a little bit.");
             else if(80<=percent && percent<90)
                      System.out.println("You just need a bit more updation.Better luck next time.");
             else if(percent>=90)
                      System.out.println("Outstanding Work.You have tried to give your best.");
          }   //end of if 
          if(ch=='E')    //if'E'is pressed in the Second time
          System.exit(0);//program will end
          if(ch!='E' && ch!='S') //if 'E' or 'S' is not pressed in the second time also
          System.out.println("Sorry.You can't play the quiz. You had to press'S' or 'E'");
                               //message displayed
    }
   }     //end of if
  }      //end of method





