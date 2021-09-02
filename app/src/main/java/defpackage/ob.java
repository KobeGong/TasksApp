package defpackage;

/* renamed from: ob reason: default package */
/* compiled from: PG */
public class ob {
    public static boolean a(android.content.Context context, android.content.Intent[] intentArr) {
        context.startActivities(intentArr, null);
        return true;
    }

    public static void a(android.content.Context context, android.content.Intent intent, android.os.Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static android.graphics.drawable.Drawable a(android.content.Context context, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        return context.getResources().getDrawable(i);
    }

    public static android.content.res.ColorStateList b(android.content.Context context, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    public static int c(android.content.Context context, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    public static int a(android.content.Context context, java.lang.String str) {
        if (str != null) {
            return context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid());
        }
        throw new java.lang.IllegalArgumentException("permission is null");
    }

    static {
        new java.lang.Object();
    }
}
