package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
/* renamed from: cyg  reason: default package */
/* compiled from: PG */
public abstract class cyg extends AtomicReference implements Runnable {
    private static final Runnable a = new cyh();
    private static final Runnable b = new cyh();

    cyg() {
    }

    /* access modifiers changed from: package-private */
    public abstract Object a();

    /* access modifiers changed from: package-private */
    public abstract void a(Object obj, Throwable th);

    /* access modifiers changed from: package-private */
    public abstract String b();

    /* access modifiers changed from: package-private */
    public abstract boolean c();

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:303)
        	at jadx.core.dex.instructions.InvokeNode.isSame(InvokeNode.java:77)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyg.run():void");
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        Runnable runnable = (Runnable) get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, b)) {
            ((Thread) runnable).interrupt();
            set(a);
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable == b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            str = new StringBuilder(String.valueOf(name).length() + 21).append("running=[RUNNING ON ").append(name).append("]").toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String b2 = b();
        return new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(b2).length()).append(str).append(", ").append(b2).toString();
    }
}
