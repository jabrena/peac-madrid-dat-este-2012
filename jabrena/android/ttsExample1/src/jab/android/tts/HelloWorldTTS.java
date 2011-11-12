package jab.android.tts;

import java.util.Locale;

import com.google.tts.TextToSpeechBeta;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class HelloWorldTTS extends Activity {
	private TextToSpeechBeta myTts;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        myTts = new TextToSpeechBeta(this, ttsInitListener);

    }

	  //"En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no hace mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor.";
    
    
    private TextToSpeechBeta.OnInitListener ttsInitListener = new TextToSpeechBeta.OnInitListener() {
          public void onInit(int status, int version) {
        	  
              //http://java.sun.com/j2se/1.4.2/docs/api/java/util/Locale.html
              //http://ftp.ics.uci.edu/pub/ietf/http/related/iso639.txt
        	  Locale spanish = new Locale("es");
        	  int result = myTts.isLanguageAvailable(spanish);
              Toast.makeText(HelloWorldTTS.this, "Result: "+result, Toast.LENGTH_SHORT).show();

        	  myTts.setLanguage(spanish);
        	  
        	  String message = "Hola Jorge Zamarriego";
        		     	  
        	  myTts.speak(message, 0, null);
            }
    };

    /**
     * Personalizando ciertos eventos en la Activity
     */
    
    public void quit() {
        setResult(RESULT_CANCELED, null);
        finish();
    }

    @Override
    public void onStop() {
    	super.onStop();
    }
    
    @Override
    protected void onDestroy() {
    	myTts.shutdown();
    	super.onDestroy();
    }

}