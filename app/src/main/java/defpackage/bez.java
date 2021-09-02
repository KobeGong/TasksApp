package defpackage;

/* renamed from: bez reason: default package */
/* compiled from: PG */
public final class bez implements android.content.ServiceConnection {
    public boolean a = false;
    public final java.util.concurrent.BlockingQueue b = new java.util.concurrent.LinkedBlockingQueue();

    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.b.add(iBinder);
    }

    public final void onServiceDisconnected(android.content.ComponentName componentName) {
    }
}
