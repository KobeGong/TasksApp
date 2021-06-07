package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* access modifiers changed from: package-private */
/* renamed from: abm  reason: default package */
/* compiled from: PG */
public final class abm implements abo {
    abm() {
    }

    @Override // defpackage.abo
    public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            Resources resources = context.getResources();
            hh hhVar = new hh(context);
            hhVar.inflate(resources, xmlPullParser, attributeSet, theme);
            return hhVar;
        } catch (Exception e) {
            Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
            return null;
        }
    }
}
