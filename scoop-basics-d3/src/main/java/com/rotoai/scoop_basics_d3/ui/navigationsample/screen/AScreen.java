package com.rotoai.scoop_basics_d3.ui.navigationsample.screen;

import com.lyft.scoop.Controller;
import com.lyft.scoop.Screen;
import com.rotoai.scoop_basics_d3.di.DaggerModule;
import com.rotoai.scoop_basics_d3.ui.navigationsample.controller.AController;
import com.rotoai.scoop_basics_d3.ui.navigationsample.module.AModule;

@Controller(AController.class)
@DaggerModule(AModule.class)
public class AScreen extends Screen {
}