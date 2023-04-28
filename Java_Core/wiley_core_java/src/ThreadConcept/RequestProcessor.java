package ThreadConcept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class RequestProcessor {

		private ExecutorService threadPool;
		private ThreadGroup databaseThreadGroup;
		private ThreadGroup reportThreadGroup;
		
		public RequestProcessor() {
			//create thread pool with 10 threads
			threadPool = Executors.newFixedThreadPool(10, new ThreadFactory() {
				@Override
				public Thread newThread(Runnable r) {
					// TODO Auto-generated method stub
					return new Thread(r);
				}
			});
			
			
			}
		}

}
