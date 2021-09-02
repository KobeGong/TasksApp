package defpackage;

/* renamed from: ehf reason: default package */
/* compiled from: PG */
public class ehf implements android.util.Printer {
    ehf() {
    }

    public void println(java.lang.String str) {
        if (str.startsWith(">")) {
            a(str);
        } else {
            b(str);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(java.lang.String str) {
        boolean a = org.chromium.base.EarlyTraceEvent.a();
        if (org.chromium.base.TraceEvent.a || a) {
            java.lang.String c = c(str);
            if (org.chromium.base.TraceEvent.a) {
                org.chromium.base.TraceEvent.nativeBeginToplevel(c);
            } else if (a) {
                org.chromium.base.EarlyTraceEvent.a("Looper.dispatchMessage: " + c);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(java.lang.String str) {
        if (org.chromium.base.EarlyTraceEvent.a()) {
            org.chromium.base.EarlyTraceEvent.b("Looper.dispatchMessage: " + c(str));
        }
        if (org.chromium.base.TraceEvent.a) {
            org.chromium.base.TraceEvent.nativeEndToplevel();
        }
    }

    private static java.lang.String c(java.lang.String str) {
        int indexOf = str.indexOf(40, 21);
        int indexOf2 = indexOf == -1 ? -1 : str.indexOf(41, indexOf);
        return indexOf2 != -1 ? str.substring(indexOf + 1, indexOf2) : "";
    }
}
