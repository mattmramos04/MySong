public class SongDriver
{
    public static void main (String[] args)
    {
        mySong lover = new mySong("Lover", "Taylor Swift", 3.6, 120, true);
        mySong twilightZone = new mySong("Twilight Zone", "Box Six", 7.25, 160, false);
        mySong blank = new mySong();
        mySong froggyFriend = new mySong("Froggy Friend", "Moss Talkers", true);

        blank.setTime(-243);
        System.out.println(blank.getTime());

        //System.out.println("Checking Length in Seconds" + lover.lengthInSec());

        /* testing getters and setters
        System.out.println(froggyFriend.toString() + "\n");
        froggyFriend.setTime(10);

        System.out.println("Froggy Friend length: " + froggyFriend.getTime());
        lover.setTime(5);
        lover.setTempo(130);
        System.out.println(lover.getTime());
//        System.out.println(lover.toString());
//        System.out.println("\n");
//        System.out.println(twilightZone.toString());
//        System.out.println("\n");
        System.out.println (blank.toString());*/
    }

}