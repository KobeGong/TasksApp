package defpackage;

/* renamed from: asa reason: default package */
final /* synthetic */ class asa implements android.view.View.OnClickListener {
    private final AddTaskFragment a;

    asa(AddTaskFragment arx) {
        this.a = arx;
    }

    public final void onClick(android.view.View view) {
        AddTaskFragment addTaskFragment = this.a;
        if (!addTaskFragment.n) {
            FragmentActivity activity = addTaskFragment.getActivity();
            if (activity instanceof defpackage.ash) {
                defpackage.dii dii = (defpackage.dii) defpackage.dca.g.a(defpackage.bg.ao);
                dii.setTitle(addTaskFragment.taskTitleView.getText().toString().trim());
                String trim = addTaskFragment.taskDetailView.getText().toString().trim();
                if (!android.text.TextUtils.isEmpty(trim)) {
                    dii.setDetail(trim);
                }
                if (addTaskFragment.ab != null) {
                    dii.a(addTaskFragment.ab);
                }
                defpackage.dih dih;
                if (dii.b) {
                    dih = dii.a;
                } else {
                    defpackage.djz.a.a(dii.a).c(dii.a);
                    dii.b = true;
                    dih = dii.a;
                }
                if (!defpackage.dih.a(dih, true)) {
                    throw new defpackage.dkw();
                }
                defpackage.dca dca = (defpackage.dca) dih;
                if (!defpackage.ajd.a(dca)) {
                    ((defpackage.ash) activity).a(dca);
                }
            }
            addTaskFragment.a(false);
        }
    }
}
