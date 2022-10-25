package sg.mirobotic.transport.ui

import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import sg.mirobotic.transport.databinding.ActivityMainBinding
import sg.mirobotic.transport.ui.base.BaseActivity


@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {

    override val mViewModel: MainViewModel by viewModels()

    override fun getViewBinding() = ActivityMainBinding.inflate(layoutInflater)

}