package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: gm  reason: default package */
/* compiled from: PG */
public class gm {
    public void a() {
    }

    public static void a(ci ciVar, cd cdVar, int i, ch chVar) {
        float f;
        float f2;
        float c;
        int i2;
        int i3 = 0;
        int i4 = 0;
        float f3 = 0.0f;
        ch chVar2 = null;
        ch chVar3 = chVar;
        while (chVar3 != null) {
            if (!(chVar3.J == 8)) {
                i2 = i4 + 1;
                if (chVar3.G != bg.y) {
                    i3 = (chVar3.k.c != null ? chVar3.k.b() : 0) + i3 + chVar3.c() + (chVar3.i.c != null ? chVar3.i.b() : 0);
                } else {
                    f3 = chVar3.Y + f3;
                }
            } else {
                i2 = i4;
            }
            ch chVar4 = chVar3.k.c != null ? chVar3.k.c.a : null;
            if (chVar4 != null && (chVar4.i.c == null || !(chVar4.i.c == null || chVar4.i.c.a == chVar3))) {
                chVar4 = null;
            }
            chVar2 = chVar3;
            chVar3 = chVar4;
            i4 = i2;
        }
        int i5 = 0;
        if (chVar2 != null) {
            if (chVar2.k.c != null) {
                i5 = chVar2.k.c.a.t;
            } else {
                i5 = 0;
            }
            if (chVar2.k.c != null && chVar2.k.c.a == ciVar) {
                i5 = ciVar.i();
            }
        }
        float f4 = ((float) i5) - ((float) i3);
        float f5 = f4 / ((float) (i4 + 1));
        if (i == 0) {
            f = f5;
        } else {
            f = f4 / ((float) i);
            f5 = 0.0f;
        }
        while (chVar != null) {
            int b = chVar.i.c != null ? chVar.i.b() : 0;
            int b2 = chVar.k.c != null ? chVar.k.b() : 0;
            if (chVar.J != 8) {
                float f6 = f5 + ((float) b);
                cdVar.a(chVar.i.h, (int) (0.5f + f6));
                if (chVar.G != bg.y) {
                    c = ((float) chVar.c()) + f6;
                } else if (f3 == 0.0f) {
                    c = ((f - ((float) b)) - ((float) b2)) + f6;
                } else {
                    c = ((((chVar.Y * f4) / f3) - ((float) b)) - ((float) b2)) + f6;
                }
                cdVar.a(chVar.k.h, (int) (0.5f + c));
                if (i == 0) {
                    c += f;
                }
                f2 = c + ((float) b2);
            } else {
                float f7 = f5 - (f / 2.0f);
                cdVar.a(chVar.i.h, (int) (0.5f + f7));
                cdVar.a(chVar.k.h, (int) (f7 + 0.5f));
                f2 = f5;
            }
            ch chVar5 = chVar.k.c != null ? chVar.k.c.a : null;
            if (!(chVar5 == null || chVar5.i.c == null || chVar5.i.c.a == chVar)) {
                chVar5 = null;
            }
            if (chVar5 == ciVar) {
                chVar5 = null;
            }
            f5 = f2;
            chVar = chVar5;
        }
    }

    public static void b(ci ciVar, cd cdVar, int i, ch chVar) {
        float f;
        float f2;
        float f3;
        int i2;
        int i3 = 0;
        int i4 = 0;
        float f4 = 0.0f;
        ch chVar2 = null;
        ch chVar3 = chVar;
        while (chVar3 != null) {
            if (!(chVar3.J == 8)) {
                i2 = i4 + 1;
                if (chVar3.H != bg.y) {
                    i3 = (chVar3.l.c != null ? chVar3.l.b() : 0) + i3 + chVar3.f() + (chVar3.j.c != null ? chVar3.j.b() : 0);
                } else {
                    f4 = chVar3.Z + f4;
                }
            } else {
                i2 = i4;
            }
            ch chVar4 = chVar3.l.c != null ? chVar3.l.c.a : null;
            if (chVar4 != null && (chVar4.j.c == null || !(chVar4.j.c == null || chVar4.j.c.a == chVar3))) {
                chVar4 = null;
            }
            chVar2 = chVar3;
            chVar3 = chVar4;
            i4 = i2;
        }
        int i5 = 0;
        if (chVar2 != null) {
            if (chVar2.l.c != null) {
                i5 = chVar2.l.c.a.t;
            } else {
                i5 = 0;
            }
            if (chVar2.l.c != null && chVar2.l.c.a == ciVar) {
                i5 = ciVar.j();
            }
        }
        float f5 = ((float) i5) - ((float) i3);
        float f6 = f5 / ((float) (i4 + 1));
        if (i == 0) {
            f = f6;
        } else {
            f = f5 / ((float) i);
            f6 = 0.0f;
        }
        while (chVar != null) {
            int b = chVar.j.c != null ? chVar.j.b() : 0;
            int b2 = chVar.l.c != null ? chVar.l.b() : 0;
            if (chVar.J != 8) {
                float f7 = f6 + ((float) b);
                cdVar.a(chVar.j.h, (int) (0.5f + f7));
                if (chVar.H != bg.y) {
                    f3 = ((float) chVar.f()) + f7;
                } else if (f4 == 0.0f) {
                    f3 = ((f - ((float) b)) - ((float) b2)) + f7;
                } else {
                    f3 = ((((chVar.Z * f5) / f4) - ((float) b)) - ((float) b2)) + f7;
                }
                cdVar.a(chVar.l.h, (int) (0.5f + f3));
                if (i == 0) {
                    f3 += f;
                }
                f2 = f3 + ((float) b2);
            } else {
                float f8 = f6 - (f / 2.0f);
                cdVar.a(chVar.j.h, (int) (0.5f + f8));
                cdVar.a(chVar.l.h, (int) (f8 + 0.5f));
                f2 = f6;
            }
            ch chVar5 = chVar.l.c != null ? chVar.l.c.a : null;
            if (!(chVar5 == null || chVar5.j.c == null || chVar5.j.c.a == chVar)) {
                chVar5 = null;
            }
            if (chVar5 == ciVar) {
                chVar5 = null;
            }
            f6 = f2;
            chVar = chVar5;
        }
    }

    public static void a(ci ciVar, cd cdVar, ch chVar) {
        boolean z;
        float f;
        int f2;
        boolean z2 = true;
        if (chVar.H == bg.y) {
            chVar.b = 1;
        } else if (ciVar.H != bg.x && chVar.H == bg.z) {
            chVar.j.h = cdVar.a(chVar.j);
            chVar.l.h = cdVar.a(chVar.l);
            int i = chVar.j.d;
            int f3 = ciVar.f() - chVar.l.d;
            cdVar.a(chVar.j.h, i);
            cdVar.a(chVar.l.h, f3);
            if (chVar.z > 0 || chVar.J == 8) {
                chVar.m.h = cdVar.a(chVar.m);
                cdVar.a(chVar.m.h, chVar.z + i);
            }
            chVar.c(i, f3);
            chVar.b = 2;
        } else if (chVar.j.c == null || chVar.l.c == null) {
            if (chVar.j.c != null && chVar.j.c.a == ciVar) {
                int b = chVar.j.b();
                int f4 = chVar.f() + b;
                chVar.j.h = cdVar.a(chVar.j);
                chVar.l.h = cdVar.a(chVar.l);
                cdVar.a(chVar.j.h, b);
                cdVar.a(chVar.l.h, f4);
                if (chVar.z > 0 || chVar.J == 8) {
                    chVar.m.h = cdVar.a(chVar.m);
                    cdVar.a(chVar.m.h, chVar.z + b);
                }
                chVar.b = 2;
                chVar.c(b, f4);
            } else if (chVar.l.c != null && chVar.l.c.a == ciVar) {
                chVar.j.h = cdVar.a(chVar.j);
                chVar.l.h = cdVar.a(chVar.l);
                int f5 = ciVar.f() - chVar.l.b();
                int f6 = f5 - chVar.f();
                cdVar.a(chVar.j.h, f6);
                cdVar.a(chVar.l.h, f5);
                if (chVar.z > 0 || chVar.J == 8) {
                    chVar.m.h = cdVar.a(chVar.m);
                    cdVar.a(chVar.m.h, chVar.z + f6);
                }
                chVar.b = 2;
                chVar.c(f6, f5);
            } else if (chVar.j.c != null && chVar.j.c.a.b == 2) {
                cf cfVar = chVar.j.c.h;
                chVar.j.h = cdVar.a(chVar.j);
                chVar.l.h = cdVar.a(chVar.l);
                int b2 = (int) (cfVar.d + ((float) chVar.j.b()) + 0.5f);
                int f7 = chVar.f() + b2;
                cdVar.a(chVar.j.h, b2);
                cdVar.a(chVar.l.h, f7);
                if (chVar.z > 0 || chVar.J == 8) {
                    chVar.m.h = cdVar.a(chVar.m);
                    cdVar.a(chVar.m.h, chVar.z + b2);
                }
                chVar.b = 2;
                chVar.c(b2, f7);
            } else if (chVar.l.c != null && chVar.l.c.a.b == 2) {
                cf cfVar2 = chVar.l.c.h;
                chVar.j.h = cdVar.a(chVar.j);
                chVar.l.h = cdVar.a(chVar.l);
                int b3 = (int) ((cfVar2.d - ((float) chVar.l.b())) + 0.5f);
                int f8 = b3 - chVar.f();
                cdVar.a(chVar.j.h, f8);
                cdVar.a(chVar.l.h, b3);
                if (chVar.z > 0 || chVar.J == 8) {
                    chVar.m.h = cdVar.a(chVar.m);
                    cdVar.a(chVar.m.h, chVar.z + f8);
                }
                chVar.b = 2;
                chVar.c(f8, b3);
            } else if (chVar.m.c == null || chVar.m.c.a.b != 2) {
                boolean z3 = chVar.m.c != null;
                if (chVar.j.c != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (chVar.l.c == null) {
                    z2 = false;
                }
                if (!z3 && !z && !z2) {
                    if (chVar instanceof cj) {
                        cj cjVar = (cj) chVar;
                        if (cjVar.af == 0) {
                            chVar.j.h = cdVar.a(chVar.j);
                            chVar.l.h = cdVar.a(chVar.l);
                            if (cjVar.ad != -1) {
                                f = (float) cjVar.ad;
                            } else if (cjVar.ae != -1) {
                                f = (float) (ciVar.f() - cjVar.ae);
                            } else {
                                f = cjVar.ac * ((float) ciVar.f());
                            }
                            int i2 = (int) (f + 0.5f);
                            cdVar.a(chVar.j.h, i2);
                            cdVar.a(chVar.l.h, i2);
                            chVar.b = 2;
                            chVar.a = 2;
                            chVar.c(i2, i2);
                            chVar.b(0, ciVar.c());
                            return;
                        }
                        return;
                    }
                    chVar.j.h = cdVar.a(chVar.j);
                    chVar.l.h = cdVar.a(chVar.l);
                    int i3 = chVar.u;
                    cdVar.a(chVar.j.h, i3);
                    cdVar.a(chVar.l.h, chVar.f() + i3);
                    if (chVar.z > 0 || chVar.J == 8) {
                        chVar.m.h = cdVar.a(chVar.m);
                        cdVar.a(chVar.m.h, i3 + chVar.z);
                    }
                    chVar.b = 2;
                }
            } else {
                cf cfVar3 = chVar.m.c.h;
                chVar.j.h = cdVar.a(chVar.j);
                chVar.l.h = cdVar.a(chVar.l);
                int i4 = (int) ((cfVar3.d - ((float) chVar.z)) + 0.5f);
                int f9 = chVar.f() + i4;
                cdVar.a(chVar.j.h, i4);
                cdVar.a(chVar.l.h, f9);
                chVar.m.h = cdVar.a(chVar.m);
                cdVar.a(chVar.m.h, chVar.z + i4);
                chVar.b = 2;
                chVar.c(i4, f9);
            }
        } else if (chVar.j.c.a == ciVar && chVar.l.c.a == ciVar) {
            int b4 = chVar.j.b();
            int b5 = chVar.l.b();
            if (ciVar.H == bg.y) {
                f2 = chVar.f() + b4;
            } else {
                b4 = (int) ((((float) (((ciVar.f() - b4) - b5) - chVar.f())) * chVar.F) + ((float) b4) + 0.5f);
                f2 = chVar.f() + b4;
            }
            chVar.j.h = cdVar.a(chVar.j);
            chVar.l.h = cdVar.a(chVar.l);
            cdVar.a(chVar.j.h, b4);
            cdVar.a(chVar.l.h, f2);
            if (chVar.z > 0 || chVar.J == 8) {
                chVar.m.h = cdVar.a(chVar.m);
                cdVar.a(chVar.m.h, chVar.z + b4);
            }
            chVar.b = 2;
            chVar.c(b4, f2);
        } else {
            chVar.b = 1;
        }
    }

    public static PorterDuffColorFilter a(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
        switch (i) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            default:
                return mode;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
        }
    }

    public static boolean a(View view) {
        if (sn.a.j(view) == 1) {
            return true;
        }
        return false;
    }

    public static int a(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = xw.a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : a;
    }

    public static Drawable b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = xw.b(context, resourceId)) == null) ? typedArray.getDrawable(i) : b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.view.animation.Interpolator a(android.content.Context r5, int r6) {
        /*
        // Method dump skipped, instructions count: 345
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm.a(android.content.Context, int):android.view.animation.Interpolator");
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, int i) {
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = resources.getAnimation(i);
            Animator a = a(context, resources, theme, xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), null, 0, 1.0f);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            return a;
        } catch (XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    private static PropertyValuesHolder a(TypedArray typedArray, int i, int i2, int i3, String str) {
        boolean z;
        PropertyValuesHolder propertyValuesHolder;
        int i4;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z2 = peekValue != null;
        int i7 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z3 = peekValue2 != null;
        int i8 = z3 ? peekValue2.type : 0;
        if (i == 4) {
            if ((!z2 || !a(i7)) && (!z3 || !a(i8))) {
                i = 0;
            } else {
                i = 3;
            }
        }
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            ou[] b = jd.b(string);
            ou[] b2 = jd.b(string2);
            if (!(b == null && b2 == null)) {
                if (b != null) {
                    hl hlVar = new hl();
                    if (b2 == null) {
                        return PropertyValuesHolder.ofObject(str, hlVar, b);
                    } else if (!jd.a(b, b2)) {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    } else {
                        return PropertyValuesHolder.ofObject(str, hlVar, b, b2);
                    }
                } else if (b2 != null) {
                    return PropertyValuesHolder.ofObject(str, new hl(), b2);
                }
            }
            return null;
        }
        hm hmVar = null;
        if (i == 3) {
            hmVar = hm.a;
        }
        if (z) {
            if (z2) {
                if (i7 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z3) {
                    if (i8 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i8 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f);
            }
        } else if (z2) {
            if (i7 == 5) {
                i5 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (a(i7)) {
                i5 = typedArray.getColor(i2, 0);
            } else {
                i5 = typedArray.getInt(i2, 0);
            }
            if (z3) {
                if (i8 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (a(i8)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5, i6);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5);
            }
        } else if (z3) {
            if (i8 == 5) {
                i4 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (a(i8)) {
                i4 = typedArray.getColor(i3, 0);
            } else {
                i4 = typedArray.getInt(i3, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i4);
        } else {
            propertyValuesHolder = null;
        }
        if (propertyValuesHolder == null || hmVar == null) {
            return propertyValuesHolder;
        }
        propertyValuesHolder.setEvaluator(hmVar);
        return propertyValuesHolder;
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) {
        PropertyValuesHolder[] propertyValuesHolderArr;
        boolean z;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        ValueAnimator valueAnimator = null;
        ArrayList arrayList2 = null;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        ObjectAnimator objectAnimator = new ObjectAnimator();
                        a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
                        z = false;
                        valueAnimator = objectAnimator;
                    } else if (name.equals("animator")) {
                        valueAnimator = a(context, resources, theme, attributeSet, null, f, xmlPullParser);
                        z = false;
                    } else if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray a = jd.a(resources, theme, attributeSet, hg.h);
                        a(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, jd.a(a, xmlPullParser, "ordering", 0, 0), f);
                        a.recycle();
                        z = false;
                        valueAnimator = animatorSet2;
                    } else if (name.equals("propertyValuesHolder")) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                        ArrayList arrayList3 = null;
                        while (true) {
                            int eventType = xmlPullParser.getEventType();
                            if (eventType != 3 && eventType != 1) {
                                if (eventType != 2) {
                                    xmlPullParser.next();
                                } else {
                                    if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                                        TypedArray a2 = jd.a(resources, theme, asAttributeSet, hg.i);
                                        String b = jd.b(a2, xmlPullParser, "propertyName", 3);
                                        int a3 = jd.a(a2, xmlPullParser, "valueType", 2, 4);
                                        ArrayList arrayList4 = null;
                                        int i6 = a3;
                                        while (true) {
                                            int next2 = xmlPullParser.next();
                                            if (next2 != 3 && next2 != 1) {
                                                if (xmlPullParser.getName().equals("keyframe")) {
                                                    if (i6 == 4) {
                                                        TypedArray a4 = jd.a(resources, theme, Xml.asAttributeSet(xmlPullParser), hg.j);
                                                        TypedValue a5 = jd.a(a4, xmlPullParser, "value");
                                                        if (!(a5 != null) || !a(a5.type)) {
                                                            i4 = 0;
                                                        } else {
                                                            i4 = 3;
                                                        }
                                                        a4.recycle();
                                                    } else {
                                                        i4 = i6;
                                                    }
                                                    TypedArray a6 = jd.a(resources, theme, Xml.asAttributeSet(xmlPullParser), hg.j);
                                                    Keyframe keyframe = null;
                                                    float a7 = jd.a(a6, xmlPullParser, "fraction", 3, -1.0f);
                                                    TypedValue a8 = jd.a(a6, xmlPullParser, "value");
                                                    boolean z2 = a8 != null;
                                                    if (i4 != 4) {
                                                        i5 = i4;
                                                    } else if (!z2 || !a(a8.type)) {
                                                        i5 = 0;
                                                    } else {
                                                        i5 = 3;
                                                    }
                                                    if (z2) {
                                                        switch (i5) {
                                                            case 0:
                                                                keyframe = Keyframe.ofFloat(a7, jd.a(a6, xmlPullParser, "value", 0, 0.0f));
                                                                break;
                                                            case 1:
                                                            case 3:
                                                                keyframe = Keyframe.ofInt(a7, jd.a(a6, xmlPullParser, "value", 0, 0));
                                                                break;
                                                        }
                                                    } else if (i5 == 0) {
                                                        keyframe = Keyframe.ofFloat(a7);
                                                    } else {
                                                        keyframe = Keyframe.ofInt(a7);
                                                    }
                                                    int a9 = jd.a(a6, xmlPullParser, "interpolator", 1);
                                                    if (a9 > 0) {
                                                        keyframe.setInterpolator(a(context, a9));
                                                    }
                                                    a6.recycle();
                                                    if (keyframe != null) {
                                                        if (arrayList4 == null) {
                                                            arrayList4 = new ArrayList();
                                                        }
                                                        arrayList4.add(keyframe);
                                                    }
                                                    xmlPullParser.next();
                                                    i3 = i4;
                                                    arrayList = arrayList4;
                                                } else {
                                                    arrayList = arrayList4;
                                                    i3 = i6;
                                                }
                                                arrayList4 = arrayList;
                                                i6 = i3;
                                            } else if (arrayList4 != null || (size = arrayList4.size()) <= 0) {
                                                propertyValuesHolder = null;
                                            } else {
                                                Keyframe keyframe2 = (Keyframe) arrayList4.get(0);
                                                Keyframe keyframe3 = (Keyframe) arrayList4.get(size - 1);
                                                float fraction = keyframe3.getFraction();
                                                if (fraction >= 1.0f) {
                                                    i2 = size;
                                                } else if (fraction < 0.0f) {
                                                    keyframe3.setFraction(1.0f);
                                                    i2 = size;
                                                } else {
                                                    arrayList4.add(arrayList4.size(), a(keyframe3, 1.0f));
                                                    i2 = size + 1;
                                                }
                                                float fraction2 = keyframe2.getFraction();
                                                if (fraction2 != 0.0f) {
                                                    if (fraction2 < 0.0f) {
                                                        keyframe2.setFraction(0.0f);
                                                    } else {
                                                        arrayList4.add(0, a(keyframe2, 0.0f));
                                                        i2++;
                                                    }
                                                }
                                                Keyframe[] keyframeArr = new Keyframe[i2];
                                                arrayList4.toArray(keyframeArr);
                                                for (int i7 = 0; i7 < i2; i7++) {
                                                    Keyframe keyframe4 = keyframeArr[i7];
                                                    if (keyframe4.getFraction() < 0.0f) {
                                                        if (i7 == 0) {
                                                            keyframe4.setFraction(0.0f);
                                                        } else if (i7 == i2 - 1) {
                                                            keyframe4.setFraction(1.0f);
                                                        } else {
                                                            int i8 = i7 + 1;
                                                            int i9 = i7;
                                                            while (i8 < i2 - 1 && keyframeArr[i8].getFraction() < 0.0f) {
                                                                i9 = i8;
                                                                i8++;
                                                            }
                                                            float fraction3 = (keyframeArr[i9 + 1].getFraction() - keyframeArr[i7 - 1].getFraction()) / ((float) ((i9 - i7) + 2));
                                                            for (int i10 = i7; i10 <= i9; i10++) {
                                                                keyframeArr[i10].setFraction(keyframeArr[i10 - 1].getFraction() + fraction3);
                                                            }
                                                        }
                                                    }
                                                }
                                                propertyValuesHolder = PropertyValuesHolder.ofKeyframe(b, keyframeArr);
                                                if (i6 == 3) {
                                                    propertyValuesHolder.setEvaluator(hm.a);
                                                }
                                            }
                                        }
                                        if (arrayList4 != null) {
                                        }
                                        propertyValuesHolder = null;
                                        if (propertyValuesHolder == null) {
                                            propertyValuesHolder = a(a2, a3, 0, 1, b);
                                        }
                                        if (propertyValuesHolder != null) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(propertyValuesHolder);
                                        }
                                        a2.recycle();
                                    }
                                    xmlPullParser.next();
                                    arrayList3 = arrayList3;
                                }
                            }
                        }
                        if (arrayList3 != null) {
                            int size2 = arrayList3.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size2];
                            for (int i11 = 0; i11 < size2; i11++) {
                                propertyValuesHolderArr[i11] = (PropertyValuesHolder) arrayList3.get(i11);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (!(propertyValuesHolderArr == null || valueAnimator == null || !(valueAnimator instanceof ValueAnimator))) {
                            valueAnimator.setValues(propertyValuesHolderArr);
                        }
                        z = true;
                    } else {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    }
                    if (animatorSet != null && !z) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(valueAnimator);
                    }
                }
            }
        }
        if (!(animatorSet == null || arrayList2 == null)) {
            Animator[] animatorArr = new Animator[arrayList2.size()];
            ArrayList arrayList5 = arrayList2;
            int size3 = arrayList5.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < size3) {
                Object obj = arrayList5.get(i13);
                i13++;
                animatorArr[i12] = (Animator) obj;
                i12++;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return valueAnimator;
    }

    private static Keyframe a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    private static ValueAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2;
        int i;
        TypedArray a = jd.a(resources, theme, attributeSet, hg.g);
        TypedArray a2 = jd.a(resources, theme, attributeSet, hg.k);
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        } else {
            valueAnimator2 = valueAnimator;
        }
        long a3 = (long) jd.a(a, xmlPullParser, "duration", 1, 300);
        long a4 = (long) jd.a(a, xmlPullParser, "startOffset", 2, 0);
        int a5 = jd.a(a, xmlPullParser, "valueType", 7, 4);
        if (jd.a(xmlPullParser, "valueFrom") && jd.a(xmlPullParser, "valueTo")) {
            if (a5 == 4) {
                TypedValue peekValue = a.peekValue(5);
                boolean z = peekValue != null;
                int i2 = z ? peekValue.type : 0;
                TypedValue peekValue2 = a.peekValue(6);
                boolean z2 = peekValue2 != null;
                int i3 = z2 ? peekValue2.type : 0;
                if ((!z || !a(i2)) && (!z2 || !a(i3))) {
                    a5 = 0;
                } else {
                    a5 = 3;
                }
            }
            PropertyValuesHolder a6 = a(a, a5, 5, 6, "");
            if (a6 != null) {
                valueAnimator2.setValues(a6);
            }
        }
        valueAnimator2.setDuration(a3);
        valueAnimator2.setStartDelay(a4);
        valueAnimator2.setRepeatCount(jd.a(a, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator2.setRepeatMode(jd.a(a, xmlPullParser, "repeatMode", 4, 1));
        if (a2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            String b = jd.b(a2, xmlPullParser, "pathData", 1);
            if (b != null) {
                String b2 = jd.b(a2, xmlPullParser, "propertyXName", 2);
                String b3 = jd.b(a2, xmlPullParser, "propertyYName", 3);
                if (b2 == null && b3 == null) {
                    throw new InflateException(a2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path a7 = jd.a(b);
                float f2 = 0.5f * f;
                PathMeasure pathMeasure = new PathMeasure(a7, false);
                float f3 = 0.0f;
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                do {
                    f3 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f3));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(a7, false);
                int min = Math.min(100, ((int) (f3 / f2)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                int i4 = 0;
                float f4 = f3 / ((float) (min - 1));
                int i5 = 0;
                float f5 = 0.0f;
                while (i5 < min) {
                    pathMeasure2.getPosTan(f5, fArr3, null);
                    fArr[i5] = fArr3[0];
                    fArr2[i5] = fArr3[1];
                    float f6 = f5 + f4;
                    if (i4 + 1 >= arrayList.size() || f6 <= ((Float) arrayList.get(i4 + 1)).floatValue()) {
                        f5 = f6;
                        i = i4;
                    } else {
                        f5 = f6 - ((Float) arrayList.get(i4 + 1)).floatValue();
                        i = i4 + 1;
                        pathMeasure2.nextContour();
                    }
                    i5++;
                    i4 = i;
                }
                PropertyValuesHolder propertyValuesHolder = null;
                PropertyValuesHolder propertyValuesHolder2 = null;
                if (b2 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(b2, fArr);
                }
                if (b3 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(b3, fArr2);
                }
                if (propertyValuesHolder == null) {
                    objectAnimator.setValues(propertyValuesHolder2);
                } else if (propertyValuesHolder2 == null) {
                    objectAnimator.setValues(propertyValuesHolder);
                } else {
                    objectAnimator.setValues(propertyValuesHolder, propertyValuesHolder2);
                }
            } else {
                objectAnimator.setPropertyName(jd.b(a2, xmlPullParser, "propertyName", 0));
            }
        }
        int a8 = jd.a(a, xmlPullParser, "interpolator", 0);
        if (a8 > 0) {
            valueAnimator2.setInterpolator(a(context, a8));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator2;
    }

    private static boolean a(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x01dc A[SYNTHETIC, Splitter:B:43:0x01dc] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(android.content.Context r28, android.content.pm.ApplicationInfo r29, java.io.File r30) {
        /*
        // Method dump skipped, instructions count: 585
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm.a(android.content.Context, android.content.pm.ApplicationInfo, java.io.File):java.util.List");
    }

    private static long a(File file) {
        long lastModified = file.lastModified();
        if (lastModified == -1) {
            return lastModified - 1;
        }
        return lastModified;
    }

    private static long b(File file) {
        long a = gn.a(file);
        if (a == -1) {
            return a - 1;
        }
        return a;
    }

    /* JADX INFO: finally extract failed */
    private static List a(File file, File file2) {
        String str = file.getName() + ".classes";
        File[] listFiles = file2.listFiles(new hy(str));
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + file2.getPath() + ").");
        } else {
            for (File file3 : listFiles) {
                new StringBuilder("Trying to delete old file ").append(file3.getPath()).append(" of size ").append(file3.length());
                if (!file3.delete()) {
                    Log.w("MultiDex", "Failed to delete old file " + file3.getPath());
                } else {
                    new StringBuilder("Deleted old file ").append(file3.getPath());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            int i = 2;
            ZipEntry entry = zipFile.getEntry("classes" + 2 + ".dex");
            while (entry != null) {
                hz hzVar = new hz(file2, str + i + ".zip");
                arrayList.add(hzVar);
                new StringBuilder("Extraction is needed for file ").append(hzVar);
                boolean z = false;
                int i2 = 0;
                while (i2 < 3 && !z) {
                    i2++;
                    InputStream inputStream = zipFile.getInputStream(entry);
                    File createTempFile = File.createTempFile("tmp-" + str, ".zip", hzVar.getParentFile());
                    new StringBuilder("Extracting ").append(createTempFile.getPath());
                    try {
                        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
                        try {
                            ZipEntry zipEntry = new ZipEntry("classes.dex");
                            zipEntry.setTime(entry.getTime());
                            zipOutputStream.putNextEntry(zipEntry);
                            byte[] bArr = new byte[16384];
                            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                                zipOutputStream.write(bArr, 0, read);
                            }
                            zipOutputStream.closeEntry();
                            zipOutputStream.close();
                            if (!createTempFile.setReadOnly()) {
                                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + hzVar.getAbsolutePath() + "\")");
                            }
                            new StringBuilder("Renaming to ").append(hzVar.getPath());
                            if (!createTempFile.renameTo(hzVar)) {
                                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + hzVar.getAbsolutePath() + "\"");
                            }
                            try {
                                hzVar.a = b(hzVar);
                                z = true;
                            } catch (IOException e) {
                                Log.w("MultiDex", "Failed to read crc from " + hzVar.getAbsolutePath(), e);
                                z = false;
                            }
                            new StringBuilder("Extraction ").append(z ? "succeeded" : "failed").append(" - length ").append(hzVar.getAbsolutePath()).append(": ").append(hzVar.length()).append(" - crc: ").append(hzVar.a);
                            if (!z) {
                                hzVar.delete();
                                if (hzVar.exists()) {
                                    Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + hzVar.getPath() + "'");
                                }
                            }
                        } catch (Throwable th) {
                            zipOutputStream.close();
                            throw th;
                        }
                    } finally {
                        a(inputStream);
                        createTempFile.delete();
                    }
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + hzVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                int i3 = i + 1;
                i = i3;
                entry = zipFile.getEntry("classes" + i3 + ".dex");
            }
            try {
            } catch (IOException e2) {
                Log.w("MultiDex", "Failed to close resource", e2);
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
        }
    }

    private static void a(Context context, long j, long j2, List list) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", list.size() + 1);
        int i = 2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hz hzVar = (hz) it.next();
            edit.putLong("dex.crc." + i, hzVar.a);
            edit.putLong("dex.time." + i, hzVar.lastModified());
            i++;
        }
        edit.commit();
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    private static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }
}
