package com.rotoai.scoop_basics_d3.ui.navigationsample.screen;

import com.lyft.scoop.Screen;
import com.rotoai.scoop_basics_d3.di.DaggerModule;
import com.rotoai.scoop_basics_d3.ui.navigationsample.controller.CController;
import com.rotoai.scoop_basics_d3.ui.navigationsample.module.CModule;
import com.lyft.scoop.Controller;
import com.lyft.scoop.Screen;

@Controller(CController.class)
@DaggerModule(CModule.class)
public class CScreen extends Screen {
}
