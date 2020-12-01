package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
    	switch(str) {
    	case "통화":
    		super.execute(str);
    		break;
    		
    	case "음악":
    		super.execute(str);
    		break;
    		
		default:
			System.out.println("앱실행");
			break;
    		
    	}
    		
    		
    		
    	
        
    }
 
    //메소드작성
    public void playMusic() {
    	System.out.println("다운로드해서 음악재생");
    }
    
    //메소드작성
    
    
    
}
