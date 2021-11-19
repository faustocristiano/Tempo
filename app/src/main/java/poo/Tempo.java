package poo;

public class Tempo {
    
private int hora;
private int minutos;
private int segundos;
private long tempoSegundos;
private long diferencaSegundos;


    public Tempo(){
   
    }
    public Tempo(int h){
    if(h>=0 && h<24){
        hora=h;        
        }  
    }
    
    public Tempo(int h, int m){
    if(h>=0 && h<24 && m>=0 &&m<60){
        hora=h;
        minutos=m;        
        }
    }

    public Tempo(int h,int m,int s){
    if(h>=0 && h<24 && m>=0 &&m<60 && s>=0 && s<60){
        hora=h;
        minutos=m;
        segundos=s;  
        }
    }

    public String toString(){
        String doisDigitos;
        if (hora < 9){
            doisDigitos = "0" + hora + ":";
        }else doisDigitos = hora + ":";
        
        if(minutos < 9){
            doisDigitos += "0"+minutos+":";
        }else doisDigitos += minutos+":";
        if(segundos < 9){
            doisDigitos += "0"+segundos;
        }else doisDigitos += segundos;

        return doisDigitos;
    }

    public boolean alterarHora(int h) {
        if(h>=0 && h<24){
            hora=h; 
            return true ;
         }
        return false ;        
    }
    
    public boolean alterarMinutos(int m) {
        if(m>=0 && m<60){
            minutos=m; 
            return true ;   
         }
        return false ;        
    }

    public boolean alterarSegundos(int s) {
        if(s>=0 && s<60){
            segundos=s; 
            return true ;
         }
          return false ;        
    }

    public long tempoSegundos(){
        tempoSegundos= (hora*3600)+(minutos*60)+segundos;
        return tempoSegundos;
    }
        public long diferencaSegundos(Tempo T){
        diferencaSegundos= T.tempoSegundos - tempoSegundos();        
        return diferencaSegundos;
    }


  
}
