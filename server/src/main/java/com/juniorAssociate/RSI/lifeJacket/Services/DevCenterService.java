package com.juniorAssociate.RSI.lifeJacket.Services;

import com.juniorAssociate.RSI.lifeJacket.Entities.DevCenter;
import com.juniorAssociate.RSI.lifeJacket.Repositories.DevCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevCenterService {
        @Autowired
        private DevCenterRepository devCenterRepository;


    public List<DevCenter> getAllDevCenters() {
            return devCenterRepository.findAll();
        }

        public void saveAllDevCenters() {
            List<DevCenter>devCenters = devCenterRepository.findAll();
            devCenterRepository.saveAll(devCenters);
        }

        public List<DevCenter> findAllDevCenters() {
            return devCenterRepository.findAll();
        }

        public DevCenter findByLocation(String location){
           return devCenterRepository.findByLocation(location);
          }
        public void deleteDevCenter(String id) {
            devCenterRepository.deleteById(id);
        }

        public void saveDevCenter(String id) {
            DevCenter devCenter = devCenterRepository.findByLocation(id);
            devCenterRepository.save(devCenter);
        }
    }

