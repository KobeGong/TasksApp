package defpackage;

/* renamed from: sb reason: default package */
/* compiled from: PG */
class sb {
    sb() {
    }

    public void a(android.view.LayoutInflater layoutInflater, android.view.LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        android.view.LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof android.view.LayoutInflater.Factory2) {
            defpackage.rz.a(layoutInflater, (android.view.LayoutInflater.Factory2) factory);
        } else {
            defpackage.rz.a(layoutInflater, factory2);
        }
    }
}
