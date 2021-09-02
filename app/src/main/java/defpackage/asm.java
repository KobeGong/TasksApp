package defpackage;

/* renamed from: asm reason: default package */
final /* synthetic */ class asm implements java.lang.Runnable {
    private final EditTaskFragment editTaskFragment;

    asm(EditTaskFragment asi) {
        this.editTaskFragment = asi;
    }

    public final void run() {
        editTaskFragment.addSubTask.requestRectangleOnScreen(new android.graphics.Rect(0, 0, editTaskFragment.addSubTask.getWidth(), editTaskFragment.addSubTask.getHeight()));
    }
}
