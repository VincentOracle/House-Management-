/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package splashscreen;


public class SplashScreen {
    public static void main(String[] args) {
       Double form= new Double();
        form.setVisible(true);
        try{
            for(int i=0;1<=30;i++){
                Thread.sleep(50);
               form.labels2.setText(Integer.toString(i)+"%");
               form.Progress1.setValue(i);  
               if(i==100){
                form.dispose();
                Login log= new Login();
                log.setVisible(true);
                Estates est= new Estates();
                est.selectpanel.setVisible(false);
            }
                        }
            
        }
        catch(Exception e){
            
        }
    }      
 
 }
               
        
    

    

