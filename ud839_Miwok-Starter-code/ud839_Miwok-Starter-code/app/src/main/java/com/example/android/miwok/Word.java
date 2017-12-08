/**
 * Created by bcmattingly on 11/13/2017.
 */

public class Word {
    private String miwok;
    private String english;


    public Word(String e, String m) {
        english = e;
        miwok = m;
    }


    public String getMiwokTranslation(){return miwok;}
    public String getDefaultTranslation(){return english;}
}
