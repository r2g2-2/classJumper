public class Jumper {
    private int id;
    private int[] allJumps;

    public Jumper(int[] allJumps, int id) {
        this.allJumps = allJumps;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getAllJumps() {
        return allJumps;
    }

    public void setAllJumps(int[] allJumps) {
        this.allJumps = allJumps;
    }

    //פעולה שמקבלת מערך של כל הקפיצות ומחזירה את הקפיצה הכי גבוהה
    static int highestJump(int[] allJumps)
    {
        int highestJump=allJumps[0];
        for (int i = 1; i < allJumps.length; i++)
        {
            if (allJumps[i]>= highestJump)
            {
                highestJump=allJumps[i];
            }
        }
        return highestJump;
    }



}
