package defpackage;

/* renamed from: fz reason: default package */
/* compiled from: PG */
public final class fz {
    public static final boolean a = (android.os.Build.VERSION.SDK_INT >= 21);
    private static final int[] b = {16842919};
    private static final int[] c = {16843623, 16842908};
    private static final int[] d = {16842908};
    private static final int[] e = {16843623};
    private static final int[] f = {16842913, 16842919};
    private static final int[] g = {16842913, 16843623, 16842908};
    private static final int[] h = {16842913, 16842908};
    private static final int[] i = {16842913, 16843623};
    private static final int[] j = {16842913};

    public static android.content.res.ColorStateList a(android.content.res.ColorStateList colorStateList) {
        if (a) {
            return new android.content.res.ColorStateList(new int[][]{j, android.util.StateSet.NOTHING}, new int[]{a(colorStateList, f), a(colorStateList, b)});
        }
        return new android.content.res.ColorStateList(new int[][]{f, g, h, i, j, b, c, d, e, android.util.StateSet.NOTHING}, new int[]{a(colorStateList, f), a(colorStateList, g), a(colorStateList, h), a(colorStateList, i), 0, a(colorStateList, b), a(colorStateList, c), a(colorStateList, d), a(colorStateList, e), 0});
    }

    private static int a(android.content.res.ColorStateList colorStateList, int[] iArr) {
        int i2;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i2 = 0;
        }
        if (a) {
            return defpackage.os.b(i2, java.lang.Math.min(android.graphics.Color.alpha(i2) * 2, 255));
        }
        return i2;
    }
}
