package oppsclanandobj;

public class codele {
   private  String name;
    int rollno;

    public void display(String name,int rollno){
        System.out.println(name);
        System.out.println(rollno);

    }
        // public static void main(String[] args) {
        //     codele vishual =new codele();
        //     vishual.name="ramji";
        //     vishual.rollno=65;
        //     vishual.display();
        // }

            public void san(){
                System.out.println();
            }

            public String getName() {
                return name;
            }

            public codele(String name, int rollno) {
                this.name = name;
                this.rollno = rollno;
            }

            public int getRollno() {
                return rollno;
            }
        }

            class main{
                public static void main(String[] args) { 
                   
                   


                    codele effect =new codele("praveen",66);
                    effect.display("praveen", 99);
                    System.out.println("my name is "+effect.getName()+effect.getRollno());


                }
            }

 
