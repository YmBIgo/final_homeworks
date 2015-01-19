/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package final_work;
/**
 *
 * @author kuriharakazuya
 */
public class Final_Work {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            for(int j = 0;j<7;j++){
                System.out.println("<input type=\"button\"onclick=\"invoke(this)\" id=\"12月"+(-1+j+i*7)+"日\"value=\""+(-1+j+i*7)+"\" style=\"width:"+75+"px;height:"+50+"px;position:absolute;top:"+(532+i*50)+"px;left:"+(96+j*75)+"px;font-size:120%\">");
                //left:96/650 top 532:922:1362:1802:2192
				//left:top=96:532-->1月 & i=5;j=7; & day = (-1+j+i*7)
				//left:top=650:532-->2月 & i=4;j=7 & day = (1+j+i*7)
				//left:top=96:922-->3月 & i=5;j=7 & day = (1+j+i*7)
				//...
				//left:top=650:2192-->12月 & i=5;j=7; & day = (-1+j+i*7)
			}
    }
}