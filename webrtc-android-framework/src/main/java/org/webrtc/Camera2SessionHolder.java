package org.webrtc;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;

import androidx.annotation.NonNull;

public class Camera2SessionHolder implements CameraSessionHolder {

    @NonNull
    public final CameraDevice device;
    @NonNull
    public final CameraCaptureSession session;
    @NonNull
    public final CaptureRequest.Builder requestBuilder;
    @NonNull
    public final Surface surface;
    @NonNull
    public final Handler handler;
    @NonNull
    public final CameraEnumerationAndroid.CaptureFormat format;

    public Camera2SessionHolder(
            @NonNull CameraDevice device,
            @NonNull CameraCaptureSession session,
            @NonNull CaptureRequest.Builder requestBuilder,
            @NonNull Surface surface,
            @NonNull Handler handler,
            @NonNull CameraEnumerationAndroid.CaptureFormat format
    ) {
        this.device = device;
        this.session = session;
        this.requestBuilder = requestBuilder;
        this.surface = surface;
        this.handler = handler;
        this.format = format;
    }
}
