package defpackage;

import android.annotation.SuppressLint;
import android.os.Message;

/* renamed from: ehc  reason: default package */
/* compiled from: PG */
final class ehc implements ehd {
    ehc() {
    }

    @Override // defpackage.ehd
    @SuppressLint({"NewApi"})
    public final void a(Message message) {
        message.setAsynchronous(true);
    }
}
