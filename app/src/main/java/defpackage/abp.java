package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* access modifiers changed from: package-private */
/* renamed from: abp  reason: default package */
/* compiled from: PG */
public final class abp implements abo {
    abp() {
    }

    @Override // defpackage.abo
    public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            return hp.a(context.getResources(), xmlPullParser, attributeSet, theme);
        } catch (Exception e) {
            Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
            return null;
        }
    }
}
