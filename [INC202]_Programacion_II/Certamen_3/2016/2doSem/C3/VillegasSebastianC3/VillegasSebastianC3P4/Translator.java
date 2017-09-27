
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Translator 
{
    private StringTokenizer st;
    private String[] ltrASCII = new String[36];
    private String[] ltrMorse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
    "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....",
    "--...","---..","----."};
    
    private String ltrAlphabetStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private char[] ltrAlphabet = ltrAlphabetStr.toCharArray();
    private char[] letras;
    
    public Translator() //Aquí lleno el String de codigos ASCII de forma rápida
    {
        int index = 65;
        for(int i = 0;i<36;i++)
        {
            
            ltrASCII[i]=("&#"+index+";");
            index++;
            if(index == 91)
            {
                index = 48;
            }
        }
    }
    
    public String TextToASCII(String linea)
    {
        boolean foundLetter, foundLetterEx = true;
        letras = linea.toCharArray();
        linea = "";
        for(int i = 0; i<letras.length;i++)
        {
            foundLetter = false;
            for(int j = 0; j<ltrAlphabet.length;j++)
            {
                if(letras[i] == ltrAlphabet[j])
                {
                    linea += (ltrASCII[j]);
                    foundLetter = true;
                }
            }
            if(letras[i] == ' ')
            {
                linea += "&#32;";
                foundLetter = true;
            }
            if(!foundLetter)
            {
                foundLetterEx = false;
            }
        }
        
        if(foundLetterEx)
        {
            return linea;
        }
        else
        {
            return "Error";
        }
    }
    
    public String TextToMorse(String linea)
    {
        boolean foundLetter, foundLetterEx = true;
        letras = linea.toCharArray();
        linea = "";
        for(int i = 0; i<letras.length;i++)
        {
            foundLetter = false;
            for(int j = 0; j<ltrAlphabet.length;j++)
            {
                if(letras[i] == ltrAlphabet[j])
                {
                    linea += (ltrMorse[j]+" ");
                    foundLetter = true;
                }
            }
            if(letras[i] == ' ')
            {
                linea += "/ ";
                foundLetter = true;
            }
            if(!foundLetter)
            {
                foundLetterEx = false;
            }
        }
        
        if(foundLetterEx)
        {
            return linea;
        }
        else
        {
            return "Error";
        }
    }
    
    public String MorseToText(String linea)
    {
        ArrayList<String> morse = new ArrayList<>();
        boolean foundLetter, foundLetterEx = true;
        st = new StringTokenizer(linea," ");
        while(st.hasMoreElements())
        {
            morse.add(st.nextToken());
        }
        linea = "";
        for(int i = 0; i<morse.size();i++)
        {
            foundLetter = false;
            for(int j = 0; j<ltrMorse.length;j++)
            {
                if(morse.get(i).equals(ltrMorse[j]))
                {
                    linea += (ltrAlphabet[j]);
                    foundLetter = true;
                }
            }
            if(morse.get(i).equals("/"))
            {
                linea += " ";
                foundLetter = true;
            }
            if(!foundLetter)
            {
                foundLetterEx = false;
            }
        }
        
        if(foundLetterEx)
        {
            return linea;
        }
        else
        {
            return "Error";
        }
    }
    
    public String MorseToASCII(String linea)
    {
        ArrayList<String> morse = new ArrayList<>();
        boolean foundLetter, foundLetterEx = true;
        st = new StringTokenizer(linea," ");
        while(st.hasMoreElements())
        {
            morse.add(st.nextToken());
        }
        linea = "";
        for(int i = 0; i<morse.size();i++)
        {
            foundLetter = false;
            for(int j = 0; j<ltrMorse.length;j++)
            {
                if(morse.get(i).equals(ltrMorse[j]))
                {
                    linea += (ltrASCII[j]);
                    foundLetter = true;
                }
            }
            if(morse.get(i).equals("/"))
            {
                linea += "&#32;";
                foundLetter = true;
            }
            if(!foundLetter)
            {
                foundLetterEx = false;
            }
        }
        
        if(foundLetterEx)
        {
            return linea;
        }
        else
        {
            return "Error";
        }
    }
    
    public String ASCIIToText(String linea)
    {
        ArrayList<String> ASCII = new ArrayList<>();
        boolean foundLetter, foundLetterEx = true;
        st = new StringTokenizer(linea,";");
        while(st.hasMoreElements())
        {
            ASCII.add(st.nextToken()+";");
        }
        linea = "";
        for(int i = 0; i<ASCII.size();i++)
        {
            foundLetter = false;
            for(int j = 0; j<ltrASCII.length;j++)
            {
                if(ASCII.get(i).equals(ltrASCII[j]))
                {
                    linea += (ltrAlphabet[j]);
                    foundLetter = true;
                }
            }
            if(ASCII.get(i).equals("&#32;"))
            {
                linea += " ";
                foundLetter = true;
            }
            if(!foundLetter)
            {
                foundLetterEx = false;
            }
        }
        
        if(foundLetterEx)
        {
            return linea;
        }
        else
        {
            return "Error";
        }
    }
    
    public String ASCIIToMorse(String linea)
    {
        ArrayList<String> ASCII = new ArrayList<>();
        boolean foundLetter, foundLetterEx = true;
        st = new StringTokenizer(linea,";");
        while(st.hasMoreElements())
        {
            ASCII.add(st.nextToken()+";");
        }
        linea = "";
        for(int i = 0; i<ASCII.size();i++)
        {
            foundLetter = false;
            for(int j = 0; j<ltrASCII.length;j++)
            {
                if(ASCII.get(i).equals(ltrASCII[j]))
                {
                    linea += (ltrMorse[j]+" ");
                    foundLetter = true;
                }
            }
            if(ASCII.get(i).equals("&#32;"))
            {
                linea += "/ ";
                foundLetter = true;
            }
            if(!foundLetter)
            {
                foundLetterEx = false;
            }
        }
        
        if(foundLetterEx)
        {
            return linea;
        }
        else
        {
            return "Error";
        }
    }  
    
}
