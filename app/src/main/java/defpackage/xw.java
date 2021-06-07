package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.apps.tasks.R;
import java.lang.reflect.Array;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: xw  reason: default package */
/* compiled from: PG */
public final class xw {
    private static final ThreadLocal a = new ThreadLocal();
    private static final WeakHashMap b = new WeakHashMap(0);
    private static final Object c = new Object();

    public static ColorStateList a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c2 = c(context, i);
        if (c2 == null) {
            return ob.b(context, i);
        }
        synchronized (c) {
            SparseArray sparseArray = (SparseArray) b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                b.put(context, sparseArray);
            }
            sparseArray.append(i, new xx(c2, context.getResources().getConfiguration()));
        }
        return c2;
    }

    public static Drawable b(Context context, int i) {
        return abl.a().a(context, i, false);
    }

    private static ColorStateList c(Context context, int i) {
        int next;
        int depth;
        TypedArray obtainStyledAttributes;
        float f;
        int[] iArr;
        Object[] objArr;
        int i2;
        Resources resources = context.getResources();
        TypedValue typedValue = (TypedValue) a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            a.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return null;
        }
        Resources resources2 = context.getResources();
        XmlResourceParser xml = resources2.getXml(i);
        try {
            Resources.Theme theme = context.getTheme();
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            String name = xml.getName();
            if (!name.equals("selector")) {
                throw new XmlPullParserException(xml.getPositionDescription() + ": invalid color state list tag " + name);
            }
            int depth2 = xml.getDepth() + 1;
            int[][] iArr2 = new int[20][];
            int[] iArr3 = new int[20];
            int i3 = 0;
            while (true) {
                int next2 = xml.next();
                if (next2 == 1 || ((depth = xml.getDepth()) < depth2 && next2 == 3)) {
                    int[] iArr4 = new int[i3];
                    int[][] iArr5 = new int[i3][];
                    System.arraycopy(iArr3, 0, iArr4, 0, i3);
                    System.arraycopy(iArr2, 0, iArr5, 0, i3);
                } else if (next2 == 2 && depth <= depth2 && xml.getName().equals("item")) {
                    int[] iArr6 = xu.aA;
                    if (theme == null) {
                        obtainStyledAttributes = resources2.obtainAttributes(asAttributeSet, iArr6);
                    } else {
                        obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr6, 0, 0);
                    }
                    int color = obtainStyledAttributes.getColor(xu.aD, -65281);
                    if (obtainStyledAttributes.hasValue(xu.aC)) {
                        f = obtainStyledAttributes.getFloat(xu.aC, 1.0f);
                    } else if (obtainStyledAttributes.hasValue(xu.aB)) {
                        f = obtainStyledAttributes.getFloat(xu.aB, 1.0f);
                    } else {
                        f = 1.0f;
                    }
                    obtainStyledAttributes.recycle();
                    int i4 = 0;
                    int attributeCount = asAttributeSet.getAttributeCount();
                    int[] iArr7 = new int[attributeCount];
                    int i5 = 0;
                    while (i5 < attributeCount) {
                        int attributeNameResource = asAttributeSet.getAttributeNameResource(i5);
                        if (attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == R.attr.alpha) {
                            i2 = i4;
                        } else {
                            i2 = i4 + 1;
                            if (!asAttributeSet.getAttributeBooleanValue(i5, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr7[i4] = attributeNameResource;
                        }
                        i5++;
                        i4 = i2;
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr7, i4);
                    int b2 = os.b(color, Math.round(((float) Color.alpha(color)) * f));
                    if (i3 + 1 > iArr3.length) {
                        int[] iArr8 = new int[ba.a(i3)];
                        System.arraycopy(iArr3, 0, iArr8, 0, i3);
                        iArr = iArr8;
                    } else {
                        iArr = iArr3;
                    }
                    iArr[i3] = b2;
                    if (i3 + 1 > iArr2.length) {
                        objArr = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), ba.a(i3));
                        System.arraycopy(iArr2, 0, objArr, 0, i3);
                    } else {
                        objArr = iArr2;
                    }
                    objArr[i3] = trimStateSet;
                    i3++;
                    iArr3 = iArr;
                    iArr2 = (int[][]) objArr;
                }
            }
            int[] iArr42 = new int[i3];
            int[][] iArr52 = new int[i3][];
            System.arraycopy(iArr3, 0, iArr42, 0, i3);
            System.arraycopy(iArr2, 0, iArr52, 0, i3);
            return new ColorStateList(iArr52, iArr42);
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    private static ColorStateList d(Context context, int i) {
        xx xxVar;
        synchronized (c) {
            SparseArray sparseArray = (SparseArray) b.get(context);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (xxVar = (xx) sparseArray.get(i)) == null)) {
                if (xxVar.b.equals(context.getResources().getConfiguration())) {
                    return xxVar.a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }
}
