package defpackage;

/* renamed from: ary reason: default package */
final /* synthetic */ class ary implements android.view.View.OnClickListener {
    private final AddTaskFragment a;

    ary(AddTaskFragment arx) {
        this.a = arx;
    }

    public final void onClick(android.view.View view) {
        AddTaskFragment arx = this.a;
        arx.taskDetailView.setVisibility(0);
        arx.taskDetailView.requestFocus();
        view.setEnabled(false);
        if (android.os.Build.VERSION.SDK_INT <= 21) {
            android.support.design.button.MaterialButton materialButton = (android.support.design.button.MaterialButton) view;
            android.graphics.drawable.Drawable d = defpackage.jd.d(materialButton.a);
            if (materialButton.a != d) {
                materialButton.a = d;
                materialButton.c();
            }
            defpackage.jd.a(d, defpackage.jd.b(arx.getResource(), 2131624064));
        }
    }
}
