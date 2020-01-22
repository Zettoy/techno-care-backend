package com.technocare.backend;

import com.technocare.backend.domain.AboutPageText;
import com.technocare.backend.domain.Service;
import com.technocare.backend.domain.TeamMember;
import com.technocare.backend.domain.Testimonial;
import com.technocare.backend.repository.AboutPageTextRepository;
import com.technocare.backend.repository.ServiceRepository;
import com.technocare.backend.repository.TeamMemberRepository;
import com.technocare.backend.repository.TestimonialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private TeamMemberRepository teamMemberRepository;
    private TestimonialRepository testimonialRepository;
    private AboutPageTextRepository aboutPageTextRepository;
    private ServiceRepository serviceRepository;

    @Autowired
    public DatabaseLoader(TeamMemberRepository teamMemberRepository, TestimonialRepository testimonialRepository, AboutPageTextRepository aboutPageTextRepository, ServiceRepository serviceRepository) {
        this.teamMemberRepository = teamMemberRepository;
        this.testimonialRepository = testimonialRepository;
        this.aboutPageTextRepository = aboutPageTextRepository;
        this.serviceRepository = serviceRepository;
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

        aboutPageTextRepository.save(new AboutPageText("About", "Techno IT solutions is a well-established software development company to enable businesses to grow up through delivering innovative, high quality, Customised Web /Desktop Solutions. Our main aim is to create a powerful web presence, online business processes or reduce your long-term IT costs,reduce paperwork by using online system. In addition we provide web design, web application, graphics design, domain name registration, networking and any hardware repairs. At Techno IT Solutions, our Software developer and technical experts provide ranges of services: Redesign and redevelop existing system customise software application according to clients,"));
        aboutPageTextRepository.save(new AboutPageText("Mission", "We repair any types of computers including Desktop PC, Laptop, Tablet computers. We can provide you software and hardware solutions at cheapest price. Our main aim is to create a powerful web presence, online business processes or reduce your long-term IT costs,reduce paperwork by using online system. In addition we provide web design, web application, graphics design, domain name registration, networking and any hardware repairs."));
        aboutPageTextRepository.save(new AboutPageText("Vision", "Our main aim is to create a powerful web presence, online business processes or reduce your long-term IT costs,reduce paperwork by using online system. In addition we provide web design, web application, graphics design, domain name registration, networking and any hardware repairs.."));
        aboutPageTextRepository.save(new AboutPageText("Philosophy", "Your satisfaction, Our desire"));

        serviceRepository.save(new Service("Computer Repair and Maintenance", "We repair any types of computers including Desktop PC, Laptop, Tablet computers. We can provide you software and hardware solutions at cheapest price.. Our main aim is to create a powerful web presence, online business processes or reduce your long-term IT costs,reduce paperwork by using online system. In addition we provide web design, web application, graphics design, domain name registration, networking and any hardware repairs."));
        serviceRepository.save(new Service("Web and Desktop Software Solution", "We repair any types of computers including Desktop PC, Laptop, Tablet computers. We can provide you software and hardware solutions at cheapest price. Our main aim is to create a powerful web presence, online business processes or reduce your long-term IT costs,reduce paperwork by using online system. In addition we provide web design, web application, graphics design, domain name registration, networking and any hardware repairs."));
        serviceRepository.save(new Service("Web Design and Development", "We design/develop great web sites based on your requirement. We are enable to design and develop powerful web solutions for medium to enterprise level clients. Our main aim is to create a powerful web presence, online business processes or reduce your long-term IT costs,reduce paperwork .In today’s business scenario, a website has become essential and must have component for every company. If your company does not have an online presence, you are missing an essential component of technology. Websites are instrumental in implementing marketing strategies that help your company develop and become more visible online. But, that requires clean and good-looking designs."));
        serviceRepository.save(new Service("Graphic Design", "We can design beautiful banner, pamplets other graphic designs/Their roster of clients, impressive portfolio of work, prominence in local markets and international reach have made us the most famous graphic design companies on the planet"));
        serviceRepository.save(new Service("Web Hosting", "Your websites and blogs are useless unless they are available online. Web hosting allows you to deliver your data and information on the website when anyone online tries to access your page. It is a form of Internet hosting service that lets an individual or business to make their web presence felt through the World Wide Web (www). Web hosting service allows you to make your online business noticeable all around the world. Genius IT Solution can help you in hosting your site as per your need."));
        serviceRepository.save(new Service("Server Management", "Server maintenance involves keeping a server software updated and running so that a computer network can operate smoothly. Regular preventive maintenance will keep the application software running as expected and will help avoid a total or partial network failure and incase server is down we help you to maintain server"));
        serviceRepository.save(new Service("Domain Name Registration", "We provide the service to park the domain name for you and your site.New top-level domain names are now available for registration. Align your brand with hundreds of memorable ideas spanning generic & geographic namespaces. Be a pioneer in this exciting new era of domains today."));
    }
}
