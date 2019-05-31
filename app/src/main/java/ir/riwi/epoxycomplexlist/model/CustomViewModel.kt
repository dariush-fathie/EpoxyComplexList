package ir.riwi.epoxycomplexlist.model

import android.content.Context
import android.view.View
import android.widget.LinearLayout
import com.airbnb.epoxy.ModelView

@ModelView(
    autoLayout = ModelView.Size.WRAP_WIDTH_WRAP_HEIGHT
    , saveViewState = true
    , fullSpan = true
)
class CustomViewModel : LinearLayout {
    constructor(context: Context) : super(context) {

    }



}