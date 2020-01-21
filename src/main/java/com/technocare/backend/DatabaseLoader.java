package com.technocare.backend;

import com.technocare.backend.domain.TeamMember;
import com.technocare.backend.domain.Testimonial;
import com.technocare.backend.repository.TeamMemberRepository;
import com.technocare.backend.repository.TestimonialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private TeamMemberRepository teamMemberRepository;
    private TestimonialRepository testimonialRepository;

    @Autowired
    public DatabaseLoader(TeamMemberRepository teamMemberRepository, TestimonialRepository testimonialRepository) {
        this.teamMemberRepository = teamMemberRepository;
        this.testimonialRepository = testimonialRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        teamMemberRepository.save(new TeamMember("Nitishman Shrestha", "IT Support Officer"));
        teamMemberRepository.save(new TeamMember("Shreeta Ranjitkar", "Developer Programmer"));
        teamMemberRepository.save(new TeamMember("Keeming Rajbhandari", "Assistant Accountant"));

        testimonialRepository.save(new Testimonial("samir", "head", "Techno has provided me great service at affordable price and I am very happy with its service."));
        testimonialRepository.save(new Testimonial("sagar", "user", "Techno has provided me great service at affordable price and I am very happy with its service."));
        testimonialRepository.save(new Testimonial("name3", "head3", "content3"));
        testimonialRepository.save(new Testimonial("name4", "head4", "content4"));
        testimonialRepository.save(new Testimonial("name5", "head5", "content5"));
    }
}
