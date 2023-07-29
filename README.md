# Cucumber-Kubernetes

GOOD LUCK!
------------------------------------------------------------------
NOTE: 
--> Set Selenium Grid on Kubernetes Cluster
--> The following are the necessary steps:
-----------------------------------------------------------------

1. Practical Steps for Kubernetes on Docker:
	- Minikube, Kubectl and Docker are installed on your machine
	- Start Minikube: minikube start
----------------------------------------------------------------------------

2. Check Kubernetes Dashboard run: 
	- minikube dashboard 
**Open command prompt in administration mode for the above command to work
--------------------------------------------------------------------------

3. Deploy Selenium Hub on Kubernetes Pod:run
	- kubectl create -f selenium-hub-deployment.yaml
----------------------------------------------------------------------------

4. Deploy Kubernetes Service:
	- kubectl create -f selenium-hub-service.yaml
----------------------------------------------------------------------------

5. Deploy Selenium Nodes Container on Pod:
	- kubectl create -f selenium-node-chrome-deployment.yaml
	- kubectl create -f selenium-node-firefox-deployment.yaml
	- kubectl create -f selenium-node-edge-deployment.yaml
----------------------------------------------------------------------------

6. Loading Selenium Grid Console:
	- minikube service selenium-hub --url
	**Take the first ip address and open this in any browser to see the console
	**Give it some time for everything to get reflected
------------------------------------------------------------------------------

7. Run Samples of Selenium Grid codes from your local machine and see it getting executed on Kubernetes
------------------------------------------------------------------------------

8. Delete the selenium-hub, service and nodes from Kubernetes:
	- kubectl delete -f selenium-hub-deployment.yaml
	- kubectl delete -f selenium-hub-service.yaml
	- kubectl delete -f selenium-node-chrome-deployment.yaml
	- kubectl create -f selenium-node-firefox-deployment.yaml
	- kubectl create -f selenium-node-edge-deployment.yaml
--------------------------------------------------------------------------------

9. Stop minikube:
	- Stop Minikube run: minikube stop
--------------------------------------------------------------------------------

10. Delete minikube:
	- Delete Minikube run: minikube delete
