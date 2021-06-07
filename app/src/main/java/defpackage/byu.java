package defpackage;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: byu  reason: default package */
/* compiled from: PG */
public final class byu {
    public final byh a;
    private final bwq b;
    private final byy c;

    public final void a(bul bul, List list, bvo bvo) {
        boolean z;
        if (bvo.d()) {
            this.a.a(bul, list, bvo);
            return;
        }
        bvo f = bvo.f();
        if (f.d() || f.e() > 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            bty.b("ChimeReceiver", new TimeoutException(), "Falling back scheduled notification receciver.", new Object[0]);
            this.c.a(bul, list);
            return;
        }
        Future a2 = this.b.a(new byw(this, bul, list, f));
        try {
            bty.a("ChimeReceiver", "Blocking until operation is finished.", new Object[0]);
            bty.a("ChimeReceiver", " - Maximum blocked time: %d ms.", Long.valueOf(f.e()));
            bty.a("ChimeReceiver", " - Total available time: %d ms.", Long.valueOf(bvo.e()));
            a2.get(f.e(), TimeUnit.MILLISECONDS);
            return;
        } catch (InterruptedException e) {
            bty.b("ChimeReceiver", e, "Retrying in scheduled notification receciver, caused by:", new Object[0]);
            Thread.currentThread().interrupt();
        } catch (ExecutionException | TimeoutException e2) {
            bty.b("ChimeReceiver", e2, "Retrying in scheduled notification receciver, caused by:", new Object[0]);
        }
        bty.a("ChimeReceiver", "Available time for scheduling: %d ms.", Long.valueOf(bvo.e()));
        this.c.a(bul, list);
    }

    public byu(bwq bwq, byh byh, byy byy) {
        this.b = bwq;
        this.a = byh;
        this.c = byy;
    }
}
