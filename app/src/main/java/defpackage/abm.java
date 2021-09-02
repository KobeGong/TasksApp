package defpackage;

/* renamed from: abm reason: default package */
/* compiled from: PG */
final class abm implements defpackage.abo {
    abm() {
    }

    public final android.graphics.drawable.Drawable a(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
        try {
            android.content.res.Resources resources = context.getResources();
            defpackage.hh hhVar = new defpackage.hh(context);
            hhVar.inflate(resources, xmlPullParser, attributeSet, theme);
            return hhVar;
        } catch (java.lang.Exception e) {
            android.util.Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
            return null;
        }
    }
}
