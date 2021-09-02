package defpackage;

/* renamed from: aee reason: default package */
/* compiled from: PG */
final class aee implements android.widget.AdapterView.OnItemSelectedListener {
    private final /* synthetic */ defpackage.aec a;

    aee(defpackage.aec aec) {
        this.a = aec;
    }

    public final void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        if (i != -1) {
            defpackage.ade ade = this.a.e;
            if (ade != null) {
                ade.a = false;
            }
        }
    }

    public final void onNothingSelected(android.widget.AdapterView adapterView) {
    }
}
