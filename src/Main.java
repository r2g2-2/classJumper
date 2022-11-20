import java.util.*;

public class Main
{
    /*
    פעולה חיצונית שמקבלת מערך קופצים ות.ז tz של קופץ ומדפיסה את ת.ז של הקופצים שקפיצתם
הטובה ביותר גבוהה מזו של הקופץ בעל ת.ז tz .אם לא היה אף אחד כזה תודפס ההודעה"האלוף".
     */
    static void gooder(Jumper[] allJumpers, int id)
    {

        int counter = 0, pass = 0;
        //לולאה שמוצאת את הקפיצה של הקופץ עם תעודת הזהות
        for (int i = 0; i < allJumpers.length; i++) {
            if (allJumpers[i].getId() == id) {
                pass = Jumper.highestJump(allJumpers[i].getAllJumps());
            }
        }
        for (int i = 0; i < allJumpers.length; i++) {
            if (Jumper.highestJump(allJumpers[i].getAllJumps()) >= pass) {
                System.out.println(allJumpers[i].getId());
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("האלוף");
        }

    }
}