package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: acl  reason: default package */
/* compiled from: PG */
public final class acl {
    private static final RectF i = new RectF();
    private static ConcurrentHashMap j = new ConcurrentHashMap();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public final Context h;
    private TextPaint k;
    private final TextView l;

    acl(TextView textView) {
        this.l = textView;
        this.h = this.l.getContext();
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        int length = this.f.length;
        this.g = length > 0;
        if (this.g) {
            this.a = 1;
            this.d = (float) this.f[0];
            this.e = (float) this.f[length - 1];
            this.c = -1.0f;
        }
        return this.g;
    }

    static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                iArr = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
                }
            }
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        } else {
            this.a = 1;
            this.d = f2;
            this.e = f3;
            this.c = f4;
            this.g = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (!e() || this.a != 1) {
            this.b = false;
        } else {
            if (!this.g || this.f.length == 0) {
                float round = (float) Math.round(this.d);
                int i2 = 1;
                while (Math.round(this.c + round) <= Math.round(this.e)) {
                    i2++;
                    round += this.c;
                }
                int[] iArr = new int[i2];
                float f2 = this.d;
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = Math.round(f2);
                    f2 += this.c;
                }
                this.f = a(iArr);
            }
            this.b = true;
        }
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        int measuredWidth;
        CharSequence charSequence;
        StaticLayout staticLayout;
        boolean z;
        if (d()) {
            if (this.b) {
                if (this.l.getMeasuredHeight() > 0 && this.l.getMeasuredWidth() > 0) {
                    if (((Boolean) a((Object) this.l, "getHorizontallyScrolling", (Object) false)).booleanValue()) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.l.getMeasuredWidth() - this.l.getTotalPaddingLeft()) - this.l.getTotalPaddingRight();
                    }
                    int height = (this.l.getHeight() - this.l.getCompoundPaddingBottom()) - this.l.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (i) {
                            i.setEmpty();
                            i.right = (float) measuredWidth;
                            i.bottom = (float) height;
                            RectF rectF = i;
                            int length = this.f.length;
                            if (length == 0) {
                                throw new IllegalStateException("No available text sizes to choose from.");
                            }
                            int i2 = length - 1;
                            int i3 = 0;
                            int i4 = 1;
                            while (i4 <= i2) {
                                int i5 = (i4 + i2) / 2;
                                int i6 = this.f[i5];
                                CharSequence text = this.l.getText();
                                TransformationMethod transformationMethod = this.l.getTransformationMethod();
                                if (transformationMethod == null || (charSequence = transformationMethod.getTransformation(text, this.l)) == null) {
                                    charSequence = text;
                                }
                                int maxLines = this.l.getMaxLines();
                                if (this.k == null) {
                                    this.k = new TextPaint();
                                } else {
                                    this.k.reset();
                                }
                                this.k.set(this.l.getPaint());
                                this.k.setTextSize((float) i6);
                                Layout.Alignment alignment = (Layout.Alignment) a(this.l, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                                if (Build.VERSION.SDK_INT >= 23) {
                                    staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.k, Math.round(rectF.right)).setAlignment(alignment).setLineSpacing(this.l.getLineSpacingExtra(), this.l.getLineSpacingMultiplier()).setIncludePad(this.l.getIncludeFontPadding()).setBreakStrategy(this.l.getBreakStrategy()).setHyphenationFrequency(this.l.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines).setTextDirection((TextDirectionHeuristic) a(this.l, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR)).build();
                                } else {
                                    staticLayout = new StaticLayout(charSequence, this.k, Math.round(rectF.right), alignment, this.l.getLineSpacingMultiplier(), this.l.getLineSpacingExtra(), this.l.getIncludeFontPadding());
                                }
                                if (maxLines != -1 && (staticLayout.getLineCount() > maxLines || staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != charSequence.length())) {
                                    z = false;
                                } else if (((float) staticLayout.getHeight()) > rectF.bottom) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z) {
                                    i3 = i4;
                                    i4 = i5 + 1;
                                } else {
                                    i3 = i5 - 1;
                                    i2 = i3;
                                }
                            }
                            float f2 = (float) this.f[i3];
                            if (f2 != this.l.getTextSize()) {
                                a(0, f2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, float f2) {
        Resources resources;
        boolean z;
        if (this.h == null) {
            resources = Resources.getSystem();
        } else {
            resources = this.h.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics());
        if (applyDimension != this.l.getPaint().getTextSize()) {
            this.l.getPaint().setTextSize(applyDimension);
            if (Build.VERSION.SDK_INT >= 18) {
                z = this.l.isInLayout();
            } else {
                z = false;
            }
            if (this.l.getLayout() != null) {
                this.b = false;
                try {
                    Method a2 = a("nullLayouts");
                    if (a2 != null) {
                        a2.invoke(this.l, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!z) {
                    this.l.requestLayout();
                } else {
                    this.l.forceLayout();
                }
                this.l.invalidate();
            }
        }
    }

    private static Object a(Object obj, String str, Object obj2) {
        try {
            obj2 = a(str).invoke(obj, new Object[0]);
            if (obj2 == null) {
            }
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
        }
        return obj2;
    }

    private static Method a(String str) {
        try {
            Method method = (Method) j.get(str);
            if (method != null) {
                return method;
            }
            Method declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0]);
            if (declaredMethod == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            j.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return e() && this.a != 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return !(this.l instanceof abq);
    }
}
