package org.optaplanner.examples.cloudbalancing.domain;

import java.util.List;

public class CloudBalance {
    
    private List<CloudComputer> computerList;
    
    private List<CloudProcess> processList;
    
    public CloudBalance() {
    }

    public CloudBalance(List<CloudComputer> computerList, List<CloudProcess> processList) {
        this.computerList = computerList;
        this.processList = processList;
    }

	/**
	 * @return the computerList
	 */
	public List<CloudComputer> getComputerList() {
		return computerList;
	}

	/**
	 * @param computerList the computerList to set
	 */
	public void setComputerList(List<CloudComputer> computerList) {
		this.computerList = computerList;
	}

	/**
	 * @return the processList
	 */
	public List<CloudProcess> getProcessList() {
		return processList;
	}

	/**
	 * @param processList the processList to set
	 */
	public void setProcessList(List<CloudProcess> processList) {
		this.processList = processList;
	}
    
    
}
