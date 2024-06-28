package org.example.proyecto.services;


import org.example.proyecto.model.dto.FrameDto;
import org.example.proyecto.model.dto.RequirementDto;
import org.example.proyecto.model.dto.StopDto;
import org.example.proyecto.model.dto.TrunckDto;
import org.hibernate.query.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoeaService {
    private final FramesService framesService;
    private final StopServices stopService;
    private final RequirementService requirementsService;
    private final TruncksServices trunkService;

    private final HashMap<Long, Long> cities = new HashMap<>();
    private final HashMap<Long, Long> inverseCities = new HashMap<>();
    private Map<String, List<RequirementDto>> requirements;
    private Map<String, List<TrunckDto>> trunks;
    private final Map<Long, Map<Long, FrameDto>> frames = new HashMap<>();
    private final String[] types = { "PARTES", "SÓLIDO", "DELICADO", "LÍQUIDO", "INFLAMABLE" };

    public MoeaService(FramesService framesService, StopServices stopService, RequirementService requirementsService, TruncksServices trunkService) {
        this.framesService = framesService;
        this.stopService = stopService;
        this.requirementsService = requirementsService;
        this.trunkService = trunkService;
    }
    public String run(){
        return "run";
    }
    public String init(){
        return "init";
    }
}
