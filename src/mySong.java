public class mySong
{
    //1)List of Instance Variables
    private String name;
    private String artist;
    private double time; //Length given in minutes
    private int tempo;
    private boolean isSingable; //does it have lyrics

    //2)Constructors
    //multi-argument constructor
    public mySong(String newName, String newArtist, double newTime, int newTempo, boolean newIsSingable)
    {
        name = newName;
        artist = newArtist;
        time = newTime;
        tempo = newTempo;
        isSingable = newIsSingable;
    }//end full constructor

    public mySong(String newName, String newArtist, boolean newIsSingable)
    {
        name = newName;
        artist = newArtist;
        time = 0.0;
        tempo = 0;
        isSingable = newIsSingable;
    }//end constructor with name, artist, and isSingable

public mySong()
    {
        name = "unnamed song";
        artist = "";
        time = 0.0;
        tempo = 0;
        isSingable = false;
    }//end default constructor

    //4) Getters (accessors)
    public String getName()
    {
        return name;
    }

    public double getTime()
    {
        return time;
    }
    public String getArtist()
    {
        return artist;
    }
    public int getTempo()
    {
        return tempo;
    }
    public boolean getIsSingable()
    {
        return isSingable;
    }
    //5) Getters (mutators)
    public void setName(String newName)
    {
        name = newName;
    }

    public void setArtist(String newArtist)
    {
        artist = newArtist;
    }

    public void setTempo(int newTempo)
    {
        tempo = newTempo;
    }

    public void setSingable(boolean newIsSingable)
    {
        isSingable = newIsSingable;
    }
    public void setTime(double newTime)
    {
        time = validateTime(newTime);
    }
    //6) Brain Methods

    private double validateTime(double newTime)
    {
        double result = 0;
        if (newTime > 0)
        {
            result = newTime;
        }
        return result;
    }

    public int lengthInSec()
    {

        int minutes = (int)time;
        int seconds =(int)((time - minutes) * 60);
        minutes *= 60;
        //will use the time variable
        //need to convert to seconds
        //take the minute (whole number) multiply by 60
        //
        //will use math
        //return the result
        return minutes + seconds;
    }
    //3)ToString
    public String toString()
    {
        String output = "Name: " + name;
        output += "\nArtist: " + artist;
        output += "\nTime: " + time;
        output += "\nTempo: " + tempo;
        output += "\nIs it Singable: " + isSingable;
        return output;
    }
}//end object mySong
