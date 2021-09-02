package defpackage;

/* renamed from: abp reason: default package */
/* compiled from: PG */
final class abp implements defpackage.abo {
    abp() {
    }

    public final android.graphics.drawable.Drawable a(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
        try {
            return defpackage.hp.a(context.getResources(), xmlPullParser, attributeSet, theme);
        } catch (java.lang.Exception e) {
            android.util.Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
            return null;
        }
    }
}
