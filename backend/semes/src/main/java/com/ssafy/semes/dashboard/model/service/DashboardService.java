package com.ssafy.semes.dashboard.model.service;

import com.ssafy.semes.dashboard.model.OHTCheckResponseDto;
import com.ssafy.semes.ohtcheck.model.OHTCheckEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DashboardService {
    List<OHTCheckResponseDto> findAllCheck();
}
