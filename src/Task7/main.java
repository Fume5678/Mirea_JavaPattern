package Task7;

import Task7.Flyweight.FontData;
import Task7.Flyweight.FontEffect;
import Task7.Proxy.IMath;
import Task7.Proxy.Math;
import Task7.Proxy.MathProxy;
import Task8.state.StateContext;

import javax.xml.crypto.Data;
import java.awt.*;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;
import java.util.WeakHashMap;

public class main {
    public static void main(String[] args) {
        FontData font1 = FontData.create(12, "arial", FontEffect.ITALIC);
        FontData font2 = FontData.create(12, "arial", FontEffect.ITALIC);

        IMath p = new MathProxy();
        System.out.println(p.add(2, 3));


        StateContext context = new StateContext();
        context.heat();
        context.heat();
        context.freeze();
        context.freeze();
        context.heat();


    }
}
