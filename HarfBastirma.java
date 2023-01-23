package Arrays;

public class HarfBastirma {

    public static void main(String[] args) {

        String [][] letter= new String[5][7];


        for(int i = 0 ; i < 5;i++){

            for(int j = 0; j < 7; j++){
                if((i==5)&&(j>4)){

                    letter[i][j]="*";
                }
                else if(i==0||i==2||i==4){

                    letter[i][j]="*";
                }
                else if((i==1)&&(j<2)){

                    letter[i][j]="*";

                }
                else if((i==3)&&(j>4)){
                    letter[i][j]="*";
                }


                else{
                    letter[i][j] = " ";
                }
            }
        }


        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}



