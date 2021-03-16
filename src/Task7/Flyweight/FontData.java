package Task7.Flyweight;

import Task7.main;

import javax.xml.crypto.Data;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;
import java.util.WeakHashMap;

public final class FontData{
    private static final WeakHashMap<FontData, WeakReference<FontData>> flyweightData =
            new WeakHashMap<>();
    private final int fontSize;
    private final String fontFace;
    private final Set<FontEffect> effectSet;

    public FontData(int fontSize, String fontFace, Set<FontEffect> effectSet) {
        this.fontSize = fontSize;
        this.fontFace = fontFace;
        this.effectSet = effectSet;
    }

    public static FontData create(String fontFace, int fontSize, FontEffect... effects){
        EnumSet<FontEffect> effectsSet = EnumSet.noneOf(FontEffect.class);
        effectsSet.addAll(Arrays.asList(effects));

        FontData data = new FontData(fontSize, fontFace, effectsSet);
        if(!flyweightData.containsKey(data)){
            flyweightData.put(data, new WeakReference<>(data));
        }
        return flyweightData.get(data).get();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof FontData) {
            if(obj == this)
                return  true;
            FontData other = (FontData) obj;

            return this.fontFace.equals(other.fontFace) && this.fontSize == ((FontData) obj).fontSize
                    && this.effectSet.equals(other.effectSet);
        }
        return false;
    }
}
