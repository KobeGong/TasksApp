package defpackage;

/* renamed from: asr reason: default package */
final /* synthetic */ class asr implements android.view.View.OnClickListener {
    private final EditTaskFragment editTaskFragment;

    asr(EditTaskFragment asi) {
        this.editTaskFragment = asi;
    }

    public final void onClick(android.view.View view) {
        editTaskFragment.a(defpackage.any.a().c().a(editTaskFragment.U, defpackage.dby.g, editTaskFragment.subTaskList.getChildCount(), editTaskFragment.W)).a();
        editTaskFragment.addSubTask.post(new defpackage.asm(editTaskFragment));
        editTaskFragment.N();
    }
}
