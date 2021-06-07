package defpackage;

import android.util.Printer;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.TraceEvent;

/* renamed from: ehf  reason: default package */
/* compiled from: PG */
public class ehf implements Printer {
    ehf() {
    }

    public void println(String str) {
        if (str.startsWith(">")) {
            a(str);
        } else {
            b(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        boolean a = EarlyTraceEvent.a();
        if (TraceEvent.a || a) {
            String c = c(str);
            if (TraceEvent.a) {
                TraceEvent.nativeBeginToplevel(c);
            } else if (a) {
                EarlyTraceEvent.a("Looper.dispatchMessage: " + c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        if (EarlyTraceEvent.a()) {
            EarlyTraceEvent.b("Looper.dispatchMessage: " + c(str));
        }
        if (TraceEvent.a) {
            TraceEvent.nativeEndToplevel();
        }
    }

    private static String c(String str) {
        int indexOf = str.indexOf(40, 21);
        int indexOf2 = indexOf == -1 ? -1 : str.indexOf(41, indexOf);
        return indexOf2 != -1 ? str.substring(indexOf + 1, indexOf2) : "";
    }
}
