package br.com.home.api_flowable_labs;

import br.com.home.api_flowable_labs.service.FlowableService;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(proxyBeanMethods = false)
public class ApiFlowableLabsApplication {

	@Autowired
	FlowableService flowableService;

	public static void main(String[] args) {
		SpringApplication.run(ApiFlowableLabsApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(final RepositoryService repositoryService,
								  final RuntimeService runtimeService,
								  final TaskService taskService) {

		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
				flowableService.createDemoUsers();
			}
		};
	}

}
