package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: yj  reason: default package */
/* compiled from: PG */
public final class yj extends MenuInflater {
    public static final Class[] a;
    private static final Class[] e;
    public final Object[] b;
    public Context c;
    public Object d;
    private final Object[] f = this.b;

    public yj(Context context) {
        super(context);
        this.c = context;
        this.b = new Object[]{context};
    }

    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof po)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.c.getResources().getLayout(i);
            a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    private final void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        boolean z;
        Object obj;
        boolean z2;
        yl ylVar = new yl(this, menu);
        int eventType = xmlPullParser.getEventType();
        boolean z3 = false;
        Object obj2 = null;
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        boolean z4 = false;
        while (!z4) {
            switch (eventType) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (!z3) {
                        String name2 = xmlPullParser.getName();
                        if (name2.equals("group")) {
                            TypedArray obtainStyledAttributes = ylVar.F.c.obtainStyledAttributes(attributeSet, xu.aY);
                            ylVar.b = obtainStyledAttributes.getResourceId(xu.bb, 0);
                            ylVar.c = obtainStyledAttributes.getInt(xu.bc, 0);
                            ylVar.d = obtainStyledAttributes.getInt(xu.bd, 0);
                            ylVar.e = obtainStyledAttributes.getInt(xu.aZ, 0);
                            ylVar.f = obtainStyledAttributes.getBoolean(xu.be, true);
                            ylVar.g = obtainStyledAttributes.getBoolean(xu.ba, true);
                            obtainStyledAttributes.recycle();
                            z = z4;
                            obj = obj2;
                            z2 = z3;
                            continue;
                        } else if (name2.equals("item")) {
                            TypedArray obtainStyledAttributes2 = ylVar.F.c.obtainStyledAttributes(attributeSet, xu.bf);
                            ylVar.i = obtainStyledAttributes2.getResourceId(xu.bp, 0);
                            ylVar.j = (obtainStyledAttributes2.getInt(xu.bq, ylVar.c) & -65536) | (obtainStyledAttributes2.getInt(xu.bt, ylVar.d) & 65535);
                            ylVar.k = obtainStyledAttributes2.getText(xu.bu);
                            ylVar.l = obtainStyledAttributes2.getText(xu.bv);
                            ylVar.m = obtainStyledAttributes2.getResourceId(xu.bo, 0);
                            ylVar.n = yl.a(obtainStyledAttributes2.getString(xu.bk));
                            ylVar.o = obtainStyledAttributes2.getInt(xu.bj, 4096);
                            ylVar.p = yl.a(obtainStyledAttributes2.getString(xu.br));
                            ylVar.q = obtainStyledAttributes2.getInt(xu.bA, 4096);
                            if (obtainStyledAttributes2.hasValue(xu.bl)) {
                                ylVar.r = obtainStyledAttributes2.getBoolean(xu.bl, false) ? 1 : 0;
                            } else {
                                ylVar.r = ylVar.e;
                            }
                            ylVar.s = obtainStyledAttributes2.getBoolean(xu.bm, false);
                            ylVar.t = obtainStyledAttributes2.getBoolean(xu.bw, ylVar.f);
                            ylVar.u = obtainStyledAttributes2.getBoolean(xu.bn, ylVar.g);
                            ylVar.v = obtainStyledAttributes2.getInt(xu.bB, -1);
                            ylVar.z = obtainStyledAttributes2.getString(xu.bs);
                            ylVar.w = obtainStyledAttributes2.getResourceId(xu.bg, 0);
                            ylVar.x = obtainStyledAttributes2.getString(xu.bi);
                            ylVar.y = obtainStyledAttributes2.getString(xu.bh);
                            boolean z5 = ylVar.y != null;
                            if (z5 && ylVar.w == 0 && ylVar.x == null) {
                                ylVar.A = (rs) ylVar.a(ylVar.y, e, ylVar.F.f);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                ylVar.A = null;
                            }
                            ylVar.B = obtainStyledAttributes2.getText(xu.bx);
                            ylVar.C = obtainStyledAttributes2.getText(xu.bC);
                            if (obtainStyledAttributes2.hasValue(xu.bz)) {
                                ylVar.E = add.a(obtainStyledAttributes2.getInt(xu.bz, -1), ylVar.E);
                            } else {
                                ylVar.E = null;
                            }
                            if (obtainStyledAttributes2.hasValue(xu.by)) {
                                ylVar.D = obtainStyledAttributes2.getColorStateList(xu.by);
                            } else {
                                ylVar.D = null;
                            }
                            obtainStyledAttributes2.recycle();
                            ylVar.h = false;
                            z = z4;
                            obj = obj2;
                            z2 = z3;
                        } else if (name2.equals("menu")) {
                            a(xmlPullParser, attributeSet, ylVar.b());
                            z = z4;
                            obj = obj2;
                            z2 = z3;
                        } else {
                            z2 = true;
                            obj = name2;
                            z = z4;
                        }
                        eventType = xmlPullParser.next();
                        z3 = z2;
                        obj2 = obj;
                        z4 = z;
                    }
                    break;
                case 3:
                    String name3 = xmlPullParser.getName();
                    if (!z3 || !name3.equals(obj2)) {
                        if (name3.equals("group")) {
                            ylVar.a();
                            z = z4;
                            obj = obj2;
                            z2 = z3;
                        } else if (name3.equals("item")) {
                            if (!ylVar.h) {
                                if (ylVar.A == null || !ylVar.A.e()) {
                                    ylVar.h = true;
                                    ylVar.a(ylVar.a.add(ylVar.b, ylVar.i, ylVar.j, ylVar.k));
                                    z = z4;
                                    obj = obj2;
                                    z2 = z3;
                                } else {
                                    ylVar.b();
                                    z = z4;
                                    obj = obj2;
                                    z2 = z3;
                                }
                            }
                        } else if (name3.equals("menu")) {
                            z = true;
                            obj = obj2;
                            z2 = z3;
                        }
                        eventType = xmlPullParser.next();
                        z3 = z2;
                        obj2 = obj;
                        z4 = z;
                    } else {
                        z2 = false;
                        obj = null;
                        z = z4;
                        continue;
                        eventType = xmlPullParser.next();
                        z3 = z2;
                        obj2 = obj;
                        z4 = z;
                    }
                    break;
            }
            z = z4;
            obj = obj2;
            z2 = z3;
            eventType = xmlPullParser.next();
            z3 = z2;
            obj2 = obj;
            z4 = z;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        a = clsArr;
        e = clsArr;
    }
}
