package com.rotoai.scoop_basics_d3.ui.navigationsample.screen;

import com.lyft.scoop.Controller;
import com.lyft.scoop.Screen;
import com.rotoai.scoop_basics_d3.di.DaggerModule;
import com.rotoai.scoop_basics_d3.ui.navigationsample.controller.BController;
import com.rotoai.scoop_basics_d3.ui.navigationsample.module.BModule;

@Controller(BController.class)
@DaggerModule(BModule.class)
public class BScreen extends Screen {
}
